package t19;

public class Selltickets implements Runnable{
    private Object obj=new Object();
    @Override
    public void run() {
        while(true){
            synchronized (obj){
            if(tickets>0){
                System.out.println(Thread.currentThread().getName()+" "+tickets--);
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }}
        }
    }
    private int tickets=100;
}
