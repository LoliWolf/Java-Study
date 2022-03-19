package t23_collections.setdemo;

import java.util.HashSet;

public class HashSetStudentDemo {
    public static void main(String[] args) {
        HashSet<Student> hs=new HashSet<Student>();

        Student s1=new Student("张三","男",19);
        Student s2=new Student("李四","男",18);
        Student s3=new Student("王五","男",13);


        Student s4=new Student("王五","男",13);
        hs.add(s1);
        hs.add(s2);
        hs.add(s3);
        hs.add(s4);
        for(Student s:hs){
            System.out.println(s.getName()+' '+s.getSex()+' '+s.getGrade());
        }
    }
}
