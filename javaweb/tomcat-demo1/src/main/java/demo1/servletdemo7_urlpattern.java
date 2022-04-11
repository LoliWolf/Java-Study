package demo1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//@WebServlet(urlPatterns = {"/demo7","/jet"})
//@WebServlet(urlPatterns = "/user/*")
//@WebServlet(urlPatterns = "*.up")
//@WebServlet(urlPatterns = "/")
public class servletdemo7_urlpattern extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("get");
    }
}

