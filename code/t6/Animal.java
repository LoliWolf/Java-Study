package t6;

public abstract class Animal implements Jumpping{
    protected String name;
    protected int age;
    Animal(){}
    Animal(String name,int age){
        this.age=age;
        this.name=name;
    }
    public void eat(){
        System.out.println("吃饭");
    }
}
