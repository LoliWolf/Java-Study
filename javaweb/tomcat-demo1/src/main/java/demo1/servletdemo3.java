package demo1;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/demo3",loadOnStartup = 1)
public class servletdemo3 implements Servlet {
    private int s=0;
    private ServletConfig servletConfig;

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
/*
初始化
 */     this.servletConfig=servletConfig;
        System.out.println("Init");
    }

    @Override
    public ServletConfig getServletConfig() {
        return servletConfig;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("success"+s++);
        System.out.println(getServletInfo());
    }

    @Override
    public String getServletInfo() {
        return " loli ";
    }

    @Override
    public void destroy() {
        System.out.println("destroy");
    }
}
