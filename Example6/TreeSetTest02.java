package Example6;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest02 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("zhangsan");
        treeSet.add("zhangsi");
        treeSet.add("wangwu");
        treeSet.add("giaji");
        treeSet.add("wangliu");
        for (String tree: treeSet
             ) {
            System.out.println(tree);
        }
    }
}

