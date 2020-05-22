package CollectionReview;

import sun.nio.cs.ext.MacArabic;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"zhangsan");
        map.put(2,"lisiaad");
        map.put(9,"lisisdadada");
        map.put(2,"lisi");
        map.put(3,"wangwu");
        System.out.println(map.size());
        System.out.println(map.get(2));
        Set<Integer> k = map.keySet();
        for (Integer i:k
             ) {
            System.out.println(i+"="+map.get(i));
        }


        Set<Map.Entry<Integer,String>> set = map.entrySet();
        for (Map.Entry<Integer,String> stringEntry:set
             ) {
            System.out.println(stringEntry.getKey()+"="+stringEntry.getValue());
        }

    }
}
