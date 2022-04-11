package demo1;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class myHttpServlet implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        HttpServletRequest request=(HttpServletRequest) servletRequest;
        String requestMethod=request.getMethod();
        if("GET".equals(requestMethod)){
            doGet();
        }
        else if("POST".equals(requestMethod)){
            doPost();
        }
    }

    protected void doPost() {
    }

    protected void doGet() {
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
