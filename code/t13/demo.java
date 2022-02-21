package t13;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class demo {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s="中国";
        byte[] bys=s.getBytes("GBK");
        System.out.println(Arrays.toString(bys));
        String ss=new String(bys,"GBK");
        System.out.println(ss);
    }
}
