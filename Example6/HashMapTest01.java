package Example6;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest01 {
    /*
    * HashMap底层是哈希表/散列表的数据结构
    * 哈希表是数组和单向链表的结合体
    * 数组:查询方面效率较高 ,随机增删效率较低
    * 单向链表:随机增删效率较高,查询方面效率较低
    * 哈希表是这两个的结合体
    * */

    //重点***:放在HashMap集合key部分的元素,以及放在HashSet集合中的元素,需要同时重写HashCode和equals方法
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1111,"hello1");
        map.put(6666,"hello2");
        map.put(7777,"hello5");
        map.put(2222,"hello22");
        map.put(2222,"hello4");

        System.out.println(map.size());
        Set<Map.Entry<Integer, String>> set = map.entrySet();
        for (Map.Entry<Integer,String> stringEntry : set
             ) {

            System.out.println(stringEntry.getKey()+"="+stringEntry.getValue());
        }
        Map<Integer,String> map1 = new HashMap<>();
        map1.put(10000,"dfad");
        map1.size();
        Set<Map.Entry<Integer,String>> set1 = map1.entrySet();
        for (Map.Entry<Integer,String> stringEntry:set1
             ) {
            System.out.println(stringEntry.getKey()+"="+stringEntry.getValue());
        }
    }
}
