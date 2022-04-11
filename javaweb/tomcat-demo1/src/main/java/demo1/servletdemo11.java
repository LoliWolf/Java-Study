package demo1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;
@WebServlet(urlPatterns = "/demo11",loadOnStartup = 1)
public class servletdemo11 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        System.out.println("get..");

        Map<String, String[]> parameterMap = req.getParameterMap();
        for(String s:parameterMap.keySet()){
            System.out.print(s+":");
            String[] strings = parameterMap.get(s);
            for(String value:strings){
                System.out.print(value+' ');
            }
            System.out.println();
        }
        System.out.println("--------------");

        String[] hobbies = req.getParameterValues("hobby");
        for(String hobby:hobbies){
            System.out.println(hobby);
        }

        String username = req.getParameter("username");
        String password = req.getParameter("password");
        System.out.println(username+':'+password);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        System.out.println("post..");
        doGet(req,resp);
    }
}
