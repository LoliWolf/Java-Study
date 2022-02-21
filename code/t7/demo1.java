package t7;
import java.io.File;
import java.io.IOException;

public class demo1 {
    public static void main(String[] args) throws IOException {
        File f1=new File("code\\t7\\f1.txt");
        System.out.println(f1.createNewFile());
        File f2=new File("code\\t7\\fold1");
        System.out.println(f2.mkdir());
        File f3=new File("code\\t7\\fold2\\fold3\\fold4\\fold5");
        System.out.println(f3.mkdirs());
        File f4=new File("code\\t7");
        String[] strArray = f4.list();
        for(String file:strArray){
            System.out.println(file);
        }
        File[] fileArray=f4.listFiles();
        for(File file:fileArray){
            if(file.isFile()){
                System.out.println(file.getName());
            }
        }
        f1.delete();
        f2.delete();
        f3.delete();
        f4.delete();
        
    }
}
