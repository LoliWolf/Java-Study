package t13;

import java.io.*;

public class demo2 {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter osw =new OutputStreamWriter(new FileOutputStream("code\\t13\\osw.txt"),"utf-8");
        osw.write("中国");
        osw.close();

        InputStreamReader isw =new InputStreamReader(new FileInputStream("code\\t13\\isw.txt"),"utf-8");
        int ch;
        while((ch=isw.read())!=-1){
            System.out.println((char)ch);
        }
        isw.close();
    }
}
