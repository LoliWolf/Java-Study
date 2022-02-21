package t11;

import java.io.*;

public class CopyDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("code\\t11\\copy.txt");
        FileOutputStream fos=new FileOutputStream("code\\t11\\paste.txt",true);
        int by;
        while((by=fis.read())!=-1){
            fos.write(by);
        }
        fis.close();
        fos.close();
    }
}
