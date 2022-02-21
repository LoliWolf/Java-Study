package t12;

import java.io.*;

public class demo_read {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("code\\t12\\read.txt");
        byte[] bys =new byte[5];
        int len=fis.read(bys);
        System.out.println(len);
        System.out.println(new String(bys));
        fis.close();
    }
}
