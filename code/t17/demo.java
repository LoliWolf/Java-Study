package t17;

public class demo {
    public static void main(String[] args) {


        ThreadPriority t1 = new ThreadPriority();
        ThreadPriority t2 = new ThreadPriority();
        ThreadPriority t3 = new ThreadPriority();

        t1.setName("1_");
        t2.setName("2_");
        t3.setName("3_");

        t1.setPriority(10);
        t2.setPriority(5);
        t3.setPriority(1);
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        System.out.println(t3.getPriority());

        t1.start();
        t2.start();
        t3.start();
    }
}
