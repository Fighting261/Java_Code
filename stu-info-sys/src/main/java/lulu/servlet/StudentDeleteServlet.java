package lulu.servlet;

import lulu.dao.StudentDAO;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @ program: Maven
 * @ Description：
 * @ CreateTime：2020/8/5 18:41
 * @ Author：Mr Zhang
 */
@WebServlet("/student/delete")
public class StudentDeleteServlet extends AbstractBaseServlet{
    @Override
    protected Object process(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        String[] ids = req.getParameterValues("ids");
        StudentDAO.delete(ids);
        return null;
    }
}
