package demo1;

import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns = "/demo6",loadOnStartup = 1)
public class servletdemo6 extends myHttpServlet{
    @Override
    protected void doGet() {
        System.out.println("Get");
    }

    @Override
    protected void doPost() {
        System.out.println("Post");
    }
}
