package t10;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class demo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos =new FileOutputStream("code\\t10\\fos.txt",true);
 //       fos.write(52);
 //       byte[] a={97,98,99,100,101};
 //       fos.write(a);
        byte[] bys="abcde".getBytes();
        for(int i=0;i<10;i++) {
            fos.write(bys, 2, bys.length - 2);
            fos.write("\r\n".getBytes());
        }
        fos.close();
    }
}
