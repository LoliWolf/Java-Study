package t18;

public class joinDemo {
    public static void main(String[] args) throws InterruptedException {
        myThread m1=new myThread();
        myThread m2=new myThread();
        myThread m3=new myThread();

        m1.setName("1_");
        m2.setName("2_");
        m3.setName("3_");

        m1.start();

        m1.join();
        m2.start();
        m3.start();
    }
}
