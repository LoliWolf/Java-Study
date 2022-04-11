package t23_collections.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class hashmap {
    public static void main(String[] args) {
        HashMap<String,String> map=new HashMap<String,String>();
        map.put("1","张三");
        map.put("2","李四");
//        System.out.println(map.containsValue("张三"));
//        map.clear();
//        System.out.println(map.isEmpty());
//        Set<String> keySet = map.keySet();
//        for(String k:keySet){
//            System.out.println(k);
//        }
//        Collection<String> values = map.values();
//        for(String v:values){
//            System.out.println(v);
//        }
//        Set<String> s=map.keySet();
//        for(String str:s){
//            System.out.println(str+','+map.get(str));
//        }
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for(Map.Entry<String,String> s:entries){
            System.out.println(s.getKey()+' '+s.getValue());
        }
    }
}
