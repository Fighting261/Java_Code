package lulu.servlet;

import lulu.dao.UserDAO;
import lulu.model.User;
import lulu.util.JSONUtil;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @ program: Maven
 * @ Description：
 * @ CreateTime：2020/8/5 19:05
 * @ Author：Mr Zhang
 */
@WebServlet("/user/login")
public class LoginServlet extends AbstractBaseServlet{
    @Override
    protected Object process(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        User u = JSONUtil.read(req.getInputStream(),User.class);
        //数据库校验用户名密码
        User query = UserDAO.query(u);
        if(query == null)
        throw new RuntimeException("用户名或密码校验失败");
        //通过用户名密码查询到用户时，生成session，并将用户保存到session中
        HttpSession session = req.getSession();//=getSession(true),没有session时，创建一个
        session.setAttribute("user",query);
        return null;
    }
}
