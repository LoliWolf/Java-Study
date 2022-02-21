package t12;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class demo_buff {
    public static void main(String[] args) throws IOException {
        //输入
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("code\\t12\\bos.txt"));
        bos.write("hello\r\n".getBytes());
        bos.write("world\r\n".getBytes());
        bos.close();
        //输出
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream("code\\t12\\bis.txt"));
        int by;
        while((by=bis.read())!=-1){
            System.out.print((char)by);
        }
        bis.close();
        BufferedInputStream bis2=new BufferedInputStream(new FileInputStream("code\\t12\\bis.txt"));
        int len;
        byte[] bys=new byte[1024];
        while((len=bis2.read(bys))!=-1){
            System.out.println(new String(bys,0,len));
        }
    }
}
