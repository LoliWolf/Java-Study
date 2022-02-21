package t9;

import java.io.File;

public class demo {
    public static void main(String[] args) {
        File f1=new File("D:\\code\\java\\pract\\Java-Study\\code");
        ls(f1);
    }
    static void ls(File file){
       File[] fileArray=file.listFiles();
       for(File files:fileArray){
           if(files.isFile()) System.out.println(files);
           else ls(files);
       }

    }
}
