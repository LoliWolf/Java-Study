package demo1;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/demo2",loadOnStartup = 1)
public class servletdemo2 implements Servlet {
    private int s=0;

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
/*
初始化
 */
 //       System.out.println("Init");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("success"+s++);
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
   //     System.out.println("destroy");
    }
}
