package t23_collections.setdemo;

public class Student {
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
    public Student(String name,String sex,int grade){
        this.name=name;
        this.sex=sex;
        this.grade=grade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (grade != student.grade) return false;
        if (name != null ? !name.equals(student.name) : student.name != null) return false;
        return sex != null ? sex.equals(student.sex) : student.sex == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (sex != null ? sex.hashCode() : 0);
        result = 31 * result + grade;
        return result;
    }
}
