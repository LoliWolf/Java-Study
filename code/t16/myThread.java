package t16;

public class myThread extends Thread{
    public myThread(){}
    public myThread(String name){
        super(name);
    }
    @Override
    public void run() {
        for(int i=0;i<100;i++){
            System.out.println(this.getName()+i+"");
        }
    }
}
