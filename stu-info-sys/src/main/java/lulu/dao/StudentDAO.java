package lulu.dao;

import lulu.model.Classes;
import lulu.model.DictionaryTag;
import lulu.model.Page;
import lulu.model.Student;
import lulu.util.DBUtil;
import lulu.util.ThreadLocalHolder;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @ program: Maven
 * @ Description：
 * @ CreateTime：2020/8/2 9:44
 * @ Author：Mr Zhang
 */
public class StudentDAO {
    public static List<Student> query(Page p) {
        Connection c = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<Student> list = new ArrayList<>();
        try{
            //1.获取数据库连接
            c = DBUtil.getConnection();
            StringBuilder sql = new StringBuilder("select s.id," +
                    "       s.student_name," +
                    "       s.student_no," +
                    "       s.id_card," +
                    "       s.student_email," +
                    "       s.classes_id," +
                    "       s.create_time," +
                    "       c.id cid," +
                    "       c.classes_name," +
                    "       c.classes_graduate_year," +
                    "       c.classes_major," +
                    "       c.classes_desc" +
                    "   from student s" +
                    "         join classes c on s.classes_id = c.id");//关联班级表和学生表，查询需要的数据（学上的数据和班级的数据）
            if(p.getSearchText() != null && p.getSearchText().trim().length()>0) {
                sql.append("    where s.student_name like ?");//模糊查询
            }
            if(p.getSortOrder() != null && p.getSortOrder().trim().length()>0) {
                //不能使用占位符替换的方式实现：字符串替换会带上‘’，order by xxx 'asc'
                //这里拼字符串的方式，存在sql注入的风险，一般会校验一下，这里省略了
                sql.append("    order by s.create_time " + p.getSortOrder());
            }
            //1.获取查询总数量：以上sql可以服用，子查询的方式实现
            StringBuilder countSQL = new StringBuilder("select count(0) count from (");
            countSQL.append(sql);
            countSQL.append(")tmp");
            ps = c.prepareStatement(countSQL.toString());
            if(p.getSearchText() != null && p.getSearchText().trim().length()>0) {
                ps.setString(1,"%"+p.getSearchText()+"%");
            }
            rs = ps.executeQuery();
            while(rs.next()) {
                int count = rs.getInt("count");
                ThreadLocalHolder.getTOTAL().set(count);//设置total变量到线程中的ThreadLocalMap数据结构中保存
            }
            //2.获取分页的数据
            sql.append("    limit ?,?");

            //2.创建操作命令对象
            ps = c.prepareStatement(sql.toString());
            int index = 1;
            if(p.getSearchText() != null && p.getSearchText().trim().length()>0) {
                ps.setString(index++,"%"+p.getSearchText()+"%");
            }
            ps.setInt(index++,(p.getPageNumber()-1)*p.getPageSize());//设置页码 = 上一页页码*每页数量
            ps.setInt(index++,p.getPageSize());
            //3.执行sql语句
            rs = ps.executeQuery();
            //4.处理查询结果
            while(rs.next()) {
               Student student = new Student();
               student.setId(rs.getInt("id"));
               student.setStudentName(rs.getString("student_name"));
               student.setStudentNo(rs.getString("student_no"));
               student.setIdCard(rs.getString("id_card"));
               student.setStudentEmail(rs.getString("student_email"));
               student.setClassesId(rs.getInt("classes_id"));
               student.setCreateTime(new Date(rs.getTimestamp("create_time").getTime()));
               Classes classes = new Classes();
               student.setClasses(classes);
               classes.setId(rs.getInt("cid"));
               classes.setClassesName(rs.getString("classes_name"));
               classes.setClassesGraduateYear(rs.getString("classes_graduate_year"));
               classes.setClassesMajor(rs.getString("classes_major"));
               classes.setClassesDesc(rs.getString("classes_desc"));
               //设置属性，通过结果集来获取设置
                list.add(student);
            }
            return list;
        }catch(Exception e) {
            throw new RuntimeException("查询学生列表出错",e);
        }finally{
            DBUtil.close(c,ps,rs);
        }
    }

    public static Student queryById(int id) {
        Connection c = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Student student = new Student();
        try{
            //1.获取数据库连接
            c = DBUtil.getConnection();
            String sql = "select s.id," +
                    "       s.student_name," +
                    "       s.student_no," +
                    "       s.id_card," +
                    "       s.student_email," +
                    "       s.classes_id," +
                    "       s.create_time," +
                    "       c.id cid," +
                    "       c.classes_name," +
                    "       c.classes_graduate_year," +
                    "       c.classes_major," +
                    "       c.classes_desc" +
                    "   from student s" +
                    "         join classes c on s.classes_id = c.id" +
                    "   where s.id=?";//关联班级表和学生表，查询需要的数据（学上的数据和班级的数据）
            //2.创建操作命令对象
            ps = c.prepareStatement(sql);
            ps.setInt(1,id);
            //3.执行sql语句
            rs = ps.executeQuery();
            //4.处理查询结果
            while(rs.next()) {
                student.setId(rs.getInt("id"));
                student.setStudentName(rs.getString("student_name"));
                student.setStudentNo(rs.getString("student_no"));
                student.setIdCard(rs.getString("id_card"));
                student.setStudentEmail(rs.getString("student_email"));
                student.setClassesId(rs.getInt("classes_id"));
                student.setCreateTime(new Date(rs.getTimestamp("create_time").getTime()));
                Classes classes = new Classes();
                student.setClasses(classes);
                classes.setId(rs.getInt("cid"));
                classes.setClassesName(rs.getString("classes_name"));
                classes.setClassesGraduateYear(rs.getString("classes_graduate_year"));
                classes.setClassesMajor(rs.getString("classes_major"));
                classes.setClassesDesc(rs.getString("classes_desc"));
                //设置属性，通过结果集来获取设置
            }
            return student;
        }catch(Exception e) {
            throw new RuntimeException("查询学生详情出错",e);
        }finally{
            DBUtil.close(c,ps,rs);
        }
    }

    public static void insert(Student s) {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            //1.获取数据库连接
            c = DBUtil.getConnection();
            String sql = "insert into student(student_name,student_no,id_card,student_email,classes_id) values(?,?,?,?,?)";
            //2.创建操作命令对象
            ps = c.prepareStatement(sql);
            ps.setString(1,s.getStudentName());
            ps.setString(2,s.getStudentNo());
            ps.setString(3,s.getIdCard());
            ps.setString(4,s.getStudentEmail());
            ps.setInt(5,s.getClassesId());
            //3.执行sql语句
            int num = ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("新增学生信息出错",e);
        }finally{
            DBUtil.close(c,ps);
        }
    }

    public static void update(Student s) {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            //1.获取数据库连接
            c = DBUtil.getConnection();
            String sql = "update student set student_name=?,student_no=?,id_card=?,student_email=?,classes_id=? where id=?";
            //2.创建操作命令对象
            ps = c.prepareStatement(sql);
            ps.setString(1,s.getStudentName());
            ps.setString(2,s.getStudentNo());
            ps.setString(3,s.getIdCard());
            ps.setString(4,s.getStudentEmail());
            ps.setInt(5,s.getClassesId());
            ps.setInt(6,s.getId());
            //3.执行sql语句
            int num = ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("修改学生信息出错",e);
        }finally{
            DBUtil.close(c,ps);
        }
    }

    public static void delete(String[] ids) {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            //1.获取数据库连接
            c = DBUtil.getConnection();
            StringBuilder sql = new StringBuilder("delete from student where id in(");
            for(int i = 0; i < ids.length; i++) {
                if(i != 0)
                    sql.append(",");
                sql.append("?");
            }
            sql.append(")");
            //2.创建操作命令对象
            ps = c.prepareStatement(sql.toString());
            for(int i = 0; i < ids.length; i++) {
                ps.setInt(i+1,Integer.parseInt(ids[i]));
            }
            //3.执行sql语句
            int num = ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("删除学生信息出错",e);
        }finally{
            DBUtil.close(c,ps);
        }
    }
}
