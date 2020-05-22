package Example6;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest01 {
    public static void main(String[] args) {
        //默认初始化为10
        List list = new ArrayList();
        System.out.println(list.size());
        List list1 = new ArrayList(20);
        System.out.println(list1.size());
    }
}
