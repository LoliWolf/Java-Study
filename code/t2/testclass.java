package t2;
public class testclass {
    private int num;
    private String name;
    private int score;
    public void setNum(int num){
        this.num=num;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setScore(int score){
        this.score=score;
    }
    public testclass(){}
    public testclass(int num,String name,int score){
        this.num=num;
        this.name=name;
        this.score=score;
    }
    public testclass(int num){
        this.num=num;
    }


}
