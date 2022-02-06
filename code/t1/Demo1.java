public class Demo1 {
    public static void demo() {
        System.out.println("?");
    }
    public static void main(String[] args) {
        ac k=new ac();
        System.out.println(k.a);
        System.out.println(k.b);
        demo();
    }
}

class ac{
    int a=10;
    protected int b=20;
}
