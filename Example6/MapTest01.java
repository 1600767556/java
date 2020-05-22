package Example6;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MapTest01 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"hu");
        map.put(2,"xin");
        map.put(3,"liang");
        String string = map.get(2);
        System.out.println(string);
        System.out.println(map.size());
        map.remove(3);
        System.out.println(map.size());
        System.out.println(map.containsKey(1));
        System.out.println(map.containsValue("hu"));
        System.out.println("------");
        System.out.println(map.containsValue(new String("aa")));
        Collection<String> strings = map.values();
        for (String s: strings
             ) {
            System.out.println(s);
        }
        System.out.println("======================");
        map.clear();
        System.out.println(map.size());
        System.out.println(map.isEmpty());
    }
}
