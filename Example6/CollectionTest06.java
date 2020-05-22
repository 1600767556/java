package Example6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTest06 {
    public static void main(String[] args) {
        /*Collection collection = new ArrayList();
        collection.add(100);
        collection.add("dad");
        collection.add("abc");
        Iterator it = collection.iterator();
        while (it.hasNext()){
            Object object = it.next();
collection.remove(object);
//it.remove();
            System.out.println(object);
        }
        System.out.println(collection.size());*/

       System.out.println("---------------------------------");
       Collection collection1 = new ArrayList();
        collection1.add("abc");
        collection1.add("def");
        collection1.add("xyz");
        Iterator iterator = collection1.iterator();
        while (iterator.hasNext()){
            Object o = iterator.next();
//collection1.remove(o);
           iterator.remove();
            System.out.println(o);
        }
        System.out.println(collection1.size());
    }
}
