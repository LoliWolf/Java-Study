package t18;

public class DeamonDemo {
    public static void main(String[] args) {
        myThread m1=new myThread();
        myThread m2=new myThread();
        myThread m3=new myThread();

        m1.setName("1_");
        m2.setName("2_");
        m3.setName("3_");

        Thread.currentThread().setName("4_");
        m1.setDaemon(true);
        m2.setDaemon(true);
        m3.setDaemon(true);

        m1.start();
        m2.start();
        m3.start();

        for(int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+""+i);
        }

    }
}
