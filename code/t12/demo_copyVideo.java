package t12;

import java.io.*;

public class demo_copyVideo {
    public static void main(String[] args) throws IOException {
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("code\\t12\\copy\\testcpy.mp4"));
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream("code\\t12\\test.mp4"));
        int len;
        byte[] bys=new byte[1024];
        while((len=bis.read(bys))!=-1){
            bos.write(bys,0,len);
        }
        bis.close();
        bos.close();
    }
}
