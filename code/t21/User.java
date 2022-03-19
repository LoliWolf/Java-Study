package t21;

public class User {
    Integer number = 0;

}
    class Test implements Runnable {
private User user;
public Test(User user) {
        this.user = user;
        }
@Override
public void run() {
        for (int i = 0; i < 20000; i++) {
        user.number++;
        System.out.println(user.number);
        }
        }
public static void main(String[] args) {
        User user = new User();
        Test test = new Test(user);
        new Thread(test).start();
        new Thread(test).start();
        }
        }
