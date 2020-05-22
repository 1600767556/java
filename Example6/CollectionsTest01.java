package Example6;

import java.util.*;

/*
java.util.collectio 集合接口
jav.util.collections 集合工具类 方便集合的操作
 */
public class CollectionsTest01 {
    public static void main(String[] args) {
        //ArrayList 不是线程安全的
        List<String> list = new LinkedList<>();
        //变成线程安全的
        Collections.synchronizedCollection(list);
        list.add("aasda");
        list.add("aaa");
        list.add("grg");
        list.add("aadde");
        Collections.sort(list);
        for (String s:list
             ) {
            System.out.println(s);
        }

        //对lis集合排序 要保证list集合实现了Comparbale 接口
        List<WuGui2> list1 = new LinkedList<>();
        list1.add(new WuGui2(1000));
        list1.add(new WuGui2(100));
        list1.add(new WuGui2(105));
        list1.add(new WuGui2(300));
        Collections.sort(list1);
        for (WuGui2 wg: list1
             ) {
            System.out.println(wg);
        }

        Set<String> strings = new HashSet<>();
        strings.add("da");
        strings.add("dada");
        strings.add("daaaa"); strings.add("dhnfuab");
        List<String> list2 = new ArrayList<>(strings);
        Collections.sort(list2);
        for (String string:list2
             ) {
            System.out.println(string);
        }


    }
}

class WuGui2 implements Comparable<WuGui2>{
    int age;

    public WuGui2(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "WuGui2{" +
                "age=" + age +
                '}';
    }

    @Override
    public int compareTo(WuGui2 o) {
        return this.age - o.age;
    }
}