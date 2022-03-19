package t23_collections.setdemo;

public class hashdemo {
    public static void main(String[] args) {
        Student s1=new Student("张三","男",19);
        Student s2=new Student("张三","男",19);

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println("hello".hashCode());
        System.out.println("重地".hashCode());
        System.out.println("通话".hashCode());
    }
}
