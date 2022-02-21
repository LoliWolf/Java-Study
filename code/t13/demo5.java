package t13;

import java.io.*;

public class demo5 {
    public static void main(String[] args) throws IOException {
//        BufferedWriter bw=new BufferedWriter(new FileWriter("code\\t13\\bw.txt"));
//        bw.write("hello");
//        bw.write("world");
//        bw.close();
        BufferedReader br=new BufferedReader(new FileReader("code\\t13\\br.txt"));
//        int ch;
//        while((ch=br.read())!=-1){
//            System.out.print((char)ch);
//        }
//        br.close();
        char[] chs =new char[1024];
        int len;
        while((len=br.read(chs))!=-1){
            System.out.println(new String(chs,0,len));
        }
        br.close();
    }
}
