package Example6;

import java.util.Set;
import java.util.TreeSet;

/*
* TreeSet集合存储特点
* 无序不可重复,但是存储的元素可以自动按照大小顺序排序
* 称为可排序集合
* */
public class TreeSetTest01 {
    public static void main(String[] args) {
        Set<String> stringSet = new TreeSet<>();
        stringSet.add("hello1");
        stringSet.add("hello2");
        stringSet.add("hello7");
        stringSet.add("hello4");
        stringSet.add("hello2");
        for (String s: stringSet
             ) {
            System.out.println(s);
        }
    }
}
