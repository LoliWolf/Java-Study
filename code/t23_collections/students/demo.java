package t23_collections.students;

import java.util.*;

public class demo {
    public static void main(String[] args) {
        List<Students> students=new ArrayList<Students>();
        Students a=new Students("张三","男",19);
        Students b=new Students("李四","男",17);
        Students c=new Students("王五","女",22);
        students.add(a);
        students.add(b);
        students.add(c);
        Iterator x=students.iterator();
        while(x.hasNext()){
            Students xs= (Students) x.next();
            System.out.println(xs.getName()+","+xs.getSex()+","+xs.getGrade());
        }
        System.out.println("****************");
        for(int i=0;i<students.size();i++){
            Students xx=students.get(i);
            System.out.println(xx.getName()+","+xx.getSex()+","+xx.getGrade());
        }
        System.out.println("****************");
        for(Students xxx:students){
            System.out.println(xxx.getName()+","+xxx.getSex()+","+xxx.getGrade());

        }
    }



}
