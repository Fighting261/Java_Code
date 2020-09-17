package lulu.servlet;

import lulu.dao.DictionaryTagDAO;
import lulu.model.DictionaryTag;
import lulu.model.Response;
import lulu.util.JSONUtil;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * @ program: Maven
 * @ Description：
 * @ CreateTime：2020/7/31 19:04
 * @ Author：Mr Zhang
 */
@WebServlet("/dict/tag/query")
public class DictionaryTagServlet extends AbstractBaseServlet {


    @Override
    protected Object process(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        String key = req.getParameter("dictionaryKey");
        List<DictionaryTag> tags = DictionaryTagDAO.query(key);
        return tags;
    }
}
