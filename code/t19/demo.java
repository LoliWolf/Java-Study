package t19;

public class demo {
    public static void main(String[] args) {
        MyRunnable m1=new MyRunnable();
        Thread t1=new Thread(m1,"1_");
        Thread t2=new Thread(m1,"2_");


        t1.start();
        t2.start();
    }
}
