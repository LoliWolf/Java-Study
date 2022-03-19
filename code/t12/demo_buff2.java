package t12;

import com.sun.javaws.IconUtil;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class demo_buff2 {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream("code\\t12\\bis.txt"));
        byte[] bys=new byte[1024];
        int x;
        while((x=bis.read(bys))!=-1){
            System.out.println(new String(bys,0,x));
        }
    }
}
