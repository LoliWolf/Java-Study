package t15;

import java.util.Collections;
import java.util.Vector;

public class SORT_TEST {
    public static void main(String[] args) {
        Vector<Integer> arr=new Vector<Integer>();
        for(int i=0;i<19;i++){
            arr.add((int)(Math.random()*10));
        }
        Collections.sort(arr);
        for(int i=0;i<19;i++){
            System.out.println(arr.get(i));
        }

    }
}
