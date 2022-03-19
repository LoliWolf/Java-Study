package t23_collections.setdemo;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> hs=new HashSet<String>();

        hs.add("hello");
        hs.add("hl");
        hs.add("hel");

        for(String s:hs){
            System.out.println(s);
        }
    }
}
