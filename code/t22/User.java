package t22;

import java.util.concurrent.locks.ReentrantLock;

public class User {
    Integer number = 0;

}
class Test implements Runnable {
    ReentrantLock lock=new ReentrantLock();
    private User user;
    public Test(User user) {
        this.user = user;
    }
    @Override
    public void run() {
        for (int i = 0; i < 20000; i++) {
            try {
                lock.lock();
                user.number++;
                System.out.println(user.number);
            }
            finally {
                lock.unlock();
            }
        }
    }
    public static void main(String[] args) {
        User user = new User();
        Test test = new Test(user);
        new Thread(test).start();
        new Thread(test).start();
    }
}
