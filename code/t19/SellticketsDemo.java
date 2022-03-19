package t19;

public class SellticketsDemo {
    public static void main(String[] args) {
        Selltickets2 s1=new Selltickets2();
        Thread t1=new Thread(s1,"窗口1");
        Thread t2=new Thread(s1,"窗口2");
        Thread t3=new Thread(s1,"窗口3");

        t1.start();
        t2.start();
        t3.start();

    }
}
