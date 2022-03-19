package t23_collections.setdemo;

import java.util.HashSet;
import java.util.Set;

public class demo {

    public static void main(String[] args) {
        Set<String> set=new HashSet<String>();
        set.add("1");
        set.add("2");
        set.add("3");
        set.add("2");
        for(String str:set){
            System.out.println(str);
        }
    }}
