package t10;

import java.io.FileInputStream;
import java.io.IOException;

public class demo2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("code\\t10\\fIs.txt");
        int by;
        String x = "";
        while((by=fis.read())!=-1){
            //          System.out.print((char)by);
            x+=(char)by;
        }
        fis.close();
        System.out.println(x);
    }
}
