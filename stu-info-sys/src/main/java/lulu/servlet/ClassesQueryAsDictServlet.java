package lulu.servlet;

import lulu.dao.ClassesDAO;
import lulu.model.Classes;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @ program: Maven
 * @ Description：
 * @ CreateTime：2020/8/4 15:45
 * @ Author：Mr Zhang
 */
@WebServlet("/classes/queryAsDict")
public class ClassesQueryAsDictServlet extends AbstractBaseServlet{

    @Override
    protected Object process(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        List<Classes> list = ClassesDAO.queryAsDict();
        return list;
    }
}
