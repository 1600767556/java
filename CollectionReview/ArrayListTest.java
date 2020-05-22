package CollectionReview;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ArrayListTest {
    public static void main(String[] args) {
        //ArrayList<String> list = new ArrayList<>();
        LinkedList<String> list = new LinkedList<>();
        list.add("zhangsan");
        list.add("lisi");
        list.add("waangwu");
        String s = list.get(0);
        System.out.println(s);
//下标
        for (int i = 0; i <list.size() ; i++) {
            String s1 = list.get(i);
            System.out.println(s1);
        }

//迭代器
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String s1 = iterator.next();
            System.out.println(s1);
        }
     /*   for ( Iterator<String> iterator2 = list.iterator();iterator2.hasNext()){
            System.out.println(iterator2.next());
        }*/

   //foreach
        for (String s2:list
             ) {
            System.out.println(s2);
        }
    }
}
