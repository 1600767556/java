package Example6;

import java.util.HashSet;
import java.util.Set;

/*
* hashset 集合无序不可重复
* */
public class HashSetTest01 {
    public static void main(String[] args) {
        Set<String> strings = new HashSet<>();
        strings.add("hello1");
        strings.add("hello8");
        strings.add("hello2");
        strings.add("hello3");
        strings.add("hello4");
        strings.add("hello3");
        for (String s: strings
             ) {
            System.out.println(s);
        }
    }
}
