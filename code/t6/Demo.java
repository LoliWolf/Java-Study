package t6;

public class Demo {
    public static void main(String[] args) {
        Animal cat=new Cat("张三",10);
        Animal dog=new Dog("李四",20);
        System.out.println(cat.name+" "+cat.age);
        System.out.println(dog.name+" "+dog.age);
    }
}
