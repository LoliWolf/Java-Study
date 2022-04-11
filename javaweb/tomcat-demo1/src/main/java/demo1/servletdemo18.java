package demo1;

import org.apache.commons.io.IOUtils;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.FileInputStream;
import java.io.IOException;

@WebServlet(urlPatterns = "/demo18")
public class servletdemo18 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        FileInputStream fileInputStream = new FileInputStream("D:\\Pictures\\壁纸\\bg.png");
        ServletOutputStream outputStream = response.getOutputStream();
//        byte[] buff = new byte[1024];
//        int len=0;
//        while((len=fileInputStream.read(buff))!=-1){
//            outputStream.write(buff,0,len);
//        }
        IOUtils.copy(fileInputStream,outputStream);
        fileInputStream.close();

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
