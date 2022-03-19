package t23_collections.students;

public class Students {
    private String name;
    private String sex;
    private  int grade;
    public String getName(){
        return name;
    }
    public String getSex(){
        return sex;
    }
    public int getGrade(){
        return grade;
    }
    public Students(String name,String sex,int grade){
        this.name=name;
        this.sex=sex;
        this.grade=grade;
    }

}
