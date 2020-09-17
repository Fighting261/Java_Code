package lulu.servlet;

import lulu.model.Response;
import lulu.util.JSONUtil;
import lulu.util.ThreadLocalHolder;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.List;

/**
 * @ program: Maven
 * @ Description：
 * @ CreateTime：2020/8/2 9:13
 * @ Author：Mr Zhang
 */
public abstract class AbstractBaseServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }
    //模板方法：参照提供HttpServlet的service方法和doXXX（）方法的关系，service就是一个模板方法
    //模板方法是提供一种统一的处理逻辑，在不同条件调用不同的方法（子类重写的方法）
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //后边的接口的，Servlet中都是类似的写法。包括设置编码， 数据类型，统一 返回的数据格式
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("application/json");

        PrintWriter pw = resp.getWriter();
        Response r = new Response();

        try {
            Object o = process(req,resp);
            r.setSuccess(true);
            r.setCode("COK200");
            r.setMessage("操作成功");
            r.setTotal(ThreadLocalHolder.getTOTAL().get());//不管是否分页接口，都获取当前线程中的total变量
            r.setData(o);
        } catch (Exception e) {
            r.setCode("ERR500");
            r.setMessage(e.getMessage());
            StringWriter sw = new StringWriter();
            PrintWriter writer = new PrintWriter(sw);
            e.printStackTrace(writer);
            String stackTrace = sw.toString();
            System.err.println(stackTrace);
            r.setStackTrace(stackTrace);
        }finally {
            ThreadLocalHolder.getTOTAL().remove();//在线程结束前，一定要记得删除变量。如果不删除，可能存在内存泄漏问题
        }
        pw.println(JSONUtil.write(r));
        pw.flush();
    }

    protected abstract Object process(HttpServletRequest req, HttpServletResponse resp)throws Exception;
}
