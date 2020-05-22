package Example6;

import java.util.ArrayList;
import java.util.Collection;

//深入了解contains
public class CollectionTest03 {
    public static void main(String[] args) {
        //创建集合对象
        Collection collection = new ArrayList();
        String s1 = new String("ad");
        collection.add(s1);
        String s2 = new String("da");
        collection.add(s2);
        System.out.println(collection.size());
        String s3 = new String("ad");
        System.out.println(collection.contains(s3));
    }
}
