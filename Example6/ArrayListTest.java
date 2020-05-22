package Example6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {
        List list = new ArrayList();
        List list1= new ArrayList(100);

        Collection collection1 = new HashSet();
        collection1.add(100);
        collection1.add(200);
        collection1.add(300);
        collection1.add(900);

        List list2 = new ArrayList(collection1);
        for (int i = 0; i <list2.size() ; i++) {
            System.out.println(list2.get(i));
        }
    }
}
