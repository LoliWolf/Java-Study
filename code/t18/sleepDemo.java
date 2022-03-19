package t18;

import t17.ThreadPriority;

public class sleepDemo {
    public static void main(String[] args) {
        myThread1 s1=new myThread1();
        myThread1 s2=new myThread1();
        myThread1 s3=new myThread1();

        s1.setName("1_");
        s2.setName("2_");
        s3.setName("3_");

        s1.start();
        s2.start();
        s3.start();
    }
}
