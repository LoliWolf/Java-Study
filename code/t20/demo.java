package t20;

import t18.myThread1;

public class demo {
    public static void main(String[] args) {
        Box box=new Box();
        Customer customer=new Customer(box);
        Producer producer=new Producer(box);
        Thread t2=new Thread(producer);
        Thread t1=new Thread(customer);

        t2.start();
        t1.start();

    }
}
