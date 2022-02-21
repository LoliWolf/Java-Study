package t12;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class demo_copeImg {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("code\\t12\\bg.png");
        FileOutputStream fos=new FileOutputStream("code\\t12\\copy\\bg.png",true);
        byte[] bys=new byte[1024];
        int len;
        while((len=fis.read(bys))!=-1){
            fos.write(bys,0,len);
        }
        fis.close();
        fos.close();
    }
}
