package lulu.servlet;

import lulu.dao.StudentDAO;
import lulu.model.Page;
import lulu.model.Student;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @ program: Maven
 * @ Description：
 * @ CreateTime：2020/8/2 9:43
 * @ Author：Mr Zhang
 */
@WebServlet("/student/query")
public class StudentQueryServlet extends AbstractBaseServlet{
    @Override
    protected Object process(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        Page p = Page.parse(req);
        List<Student> students = StudentDAO.query(p);
        return students;
    }
}
