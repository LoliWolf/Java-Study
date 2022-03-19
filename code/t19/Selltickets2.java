package t19;

import java.util.concurrent.locks.ReentrantLock;

public class Selltickets2 implements Runnable{
    private Object obj=new Object();
    ReentrantLock lock=new ReentrantLock();
    @Override
    public void run() {
        while(true){
           try{
                lock.lock();
                if(tickets>0){
                    System.out.println(Thread.currentThread().getName()+" "+tickets--);
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }}
           finally {
               lock.unlock();
           }
        }
    }
    private int tickets=100;
}
