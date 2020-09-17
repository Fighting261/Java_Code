package lulu.servlet;

import lulu.dao.StudentDAO;
import lulu.model.Student;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @ program: Maven
 * @ Description：
 * @ CreateTime：2020/8/4 16:39
 * @ Author：Mr Zhang
 */
@WebServlet("/student/queryById")
public class StudentQueryByIdServlet extends AbstractBaseServlet{

    @Override
    protected Object process(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        String id = req.getParameter("id");
        Student s = StudentDAO.queryById(Integer.parseInt(id));
        return s;
    }
}
