package lulu.servlet;

import lulu.dao.StudentDAO;
import lulu.model.Student;
import lulu.util.JSONUtil;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @ program: Maven
 * @ Description：
 * @ CreateTime：2020/8/4 16:58
 * @ Author：Mr Zhang
 */
@WebServlet("/student/add")
public class StudentAddServlet extends AbstractBaseServlet{
    @Override
    protected Object process(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        Student s = JSONUtil.read(req.getInputStream(), Student.class);
        StudentDAO.insert(s);
        return null;
    }
}
