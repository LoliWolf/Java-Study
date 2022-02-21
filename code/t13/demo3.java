package t13;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class demo3 {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("code\\t13\\osw2.txt"));
        osw.write(97);
        osw.flush();
        osw.close();
    }
}
