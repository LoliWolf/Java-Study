package t23_collections.linkedlistdemo;

import java.util.LinkedList;

public class linkedlistdemo {
    public static void main(String[] args) {
        LinkedList<String> linkedList=new LinkedList<String>();
        linkedList.add("hello1");
        linkedList.add("hello2");
        linkedList.add("hello3");
        for(String x:linkedList){
            System.out.println(x);
        }
        System.out.println();
        linkedList.addLast("hello4");
        linkedList.addFirst("hello5");
        for(String x:linkedList){
            System.out.println(x);
        }
        System.out.println();
        System.out.println(linkedList.removeFirst());
        System.out.println(linkedList.removeLast());
        System.out.println();
        for(String x:linkedList){
            System.out.println(x);
        }
    }
}
