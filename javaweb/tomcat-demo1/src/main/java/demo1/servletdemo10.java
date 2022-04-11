package demo1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
@WebServlet(urlPatterns = "/demo10")
public class servletdemo10 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        String method = req.getMethod();
//        System.out.println(method);
//
//        String contextPath = req.getContextPath();
//        System.out.println(contextPath);
//
//        StringBuffer requestURL = req.getRequestURL();
//        System.out.println(requestURL.toString());
//
//        String requestURI = req.getRequestURI();
//        System.out.println(requestURI);
//
//        String queryString = req.getQueryString();
//        System.out.println(queryString);
//
//        String header = req.getHeader("user-agent");
//        //浏览器版本信息
//        System.out.println(header);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        BufferedReader reader = req.getReader();
        String s = reader.readLine();
        System.out.println(s);
        System.out.println(req.getParameter("username"));
        this.doGet(req,resp);
    }
}
