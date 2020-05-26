package Example6;

import java.util.LinkedList;
import java.util.List;

public class Array_Link_ListTest {
    public static void main(String[] args) {
        //List list = new ArrayList(); //底层用数组
        List list = new LinkedList();//底层用链表
        list.add("dasd");
        list.add("dafaaf");
        list.add("dadadad");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
