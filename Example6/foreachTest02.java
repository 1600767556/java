package Example6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class foreachTest02 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("da");
        list.add("da");
        //使用迭代器遍历
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }
//使用小标的方式
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }
        //使用foreach
        for (String s: list
             ) {
            System.out.println(s);
        }
    }
}
