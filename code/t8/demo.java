package t8;

public class demo {
    static long jc(long n){
        if(n==1) return 1;
        else return n*jc(n-1);
    }

    public static void main(String[] args) {
        System.out.println(jc(6));
    }

}
