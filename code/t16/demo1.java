package t16;

public class demo1 {
    public static void main(String[] args) {
        myThread m1=new myThread("_1");
        myThread m2=new myThread("_2");
//        m1.setName("1_");
//        m2.setName("2_");
//        m1.start();m2.start();
        Thread.currentThread().setName("?");
        System.out.println(Thread.currentThread().getName());
    }
}
