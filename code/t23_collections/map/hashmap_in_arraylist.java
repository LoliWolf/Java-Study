package t23_collections.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class hashmap_in_arraylist {
    public static void main(String[] args) {
        ArrayList<HashMap<String,String>> arrayList=new ArrayList<>();
        HashMap<String,String> hashMap1=new HashMap<>();
        HashMap<String,String> hashMap2=new HashMap<>();
        HashMap<String,String> hashMap3=new HashMap<>();
        hashMap1.put("1","张三");
        hashMap1.put("2","张四");
        hashMap2.put("1","李四");
        hashMap2.put("2","李五");
        hashMap3.put("1","王五");
        hashMap3.put("2","王六");
        arrayList.add(hashMap1);
        arrayList.add(hashMap2);
        arrayList.add(hashMap3);
        for(HashMap<String,String> s:arrayList){
            Set<String> keySet = s.keySet();
            for(String key:keySet){
                System.out.println(key+" "+s.get(key));
            }
        }

    }
}
