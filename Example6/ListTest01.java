package Example6;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("a");
        list.add("b");
        list.add("king");
        list.add("c");
        list.add(1,"king");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("------------------");
        Object firstObject = list.get(0);
        System.out.println(firstObject);
        System.out.println("-----------------------------");
        for (int i = 0; i <list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("--------------------342----");
        System.out.println(list.indexOf("king"));
        System.out.println("-----");
        System.out.println(list.lastIndexOf("king"));
        System.out.println("--------");
        list.remove(0);
        System.out.println(list.size());
        System.out.println("----------------");
        list.set(0,"huxinlaing");

        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }
    }
}
