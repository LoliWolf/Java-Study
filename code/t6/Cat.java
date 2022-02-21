package t6;

public class Cat extends Animal{
    Cat(){}
    Cat(String name,int age){
        super.name=name;
        super.age=age;
    }

    @Override
    public void eat() {
        System.out.println("猫 "+name+"吃饭");;
    }
    @Override
    public void jump(){
        System.out.println("猫 "+name+"跳高");
    }
}
