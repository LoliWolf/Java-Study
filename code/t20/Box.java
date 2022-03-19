package t20;

public class Box {
    private int milk;
    private boolean state=false;

    public synchronized void put(int milk){
        if(state){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        this.milk=milk;
        System.out.println("存储成功:"+this.milk);
        state=true;
        notifyAll();
    }
    public synchronized void get(){
        if(!state){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("获取成功:"+this.milk);
        state=false;
        notifyAll();
    }

}
