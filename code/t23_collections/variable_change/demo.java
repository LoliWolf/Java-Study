package t23_collections.variable_change;

public class demo {
    public static int sum(int...a){
        int sum=0;
        for(int s:a){
            sum+=s;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sum(1,2,3,4,5,6,7,9,10));
    }
}
