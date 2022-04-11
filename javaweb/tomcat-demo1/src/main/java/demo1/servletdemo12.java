package demo1;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.lang.*;
import java.nio.charset.StandardCharsets;

@WebServlet(urlPatterns = "/demo12")
public class servletdemo12 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        username = new String(username.getBytes(StandardCharsets.ISO_8859_1), StandardCharsets.UTF_8);
        System.out.println(username);


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
