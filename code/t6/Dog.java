package t6;

public class Dog extends Animal{
    Dog(){}
    Dog(String name,int age){
        super.name=name;
        super.age=age;
    }

    @Override
    public void eat() {
        System.out.println("狗 "+name+"吃饭");;
    }
    @Override
    public void jump(){
        System.out.println("狗 "+name+"跳高");
    }
}
