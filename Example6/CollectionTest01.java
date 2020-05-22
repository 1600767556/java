package Example6;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest01 {
    public static void main(String[] args) {
         //Collection c = new Collection()  //接口是抽象的 无法实例化
        Collection collection = new ArrayList();
        collection.add(1200);//自动装箱
        collection.add(new Object());
        collection.add(true);
        collection.add(new student());
        System.out.println("c集合中的元素个数是: "+collection.size());

        collection.clear();
        System.out.println("c集合中的元素个数是: "+collection.size());

        collection.add("Hello!");//""Hello对象的内存地址存放到集合当中
        collection.add("少少");
        collection.add("焰灵姬");

        boolean collection1 = collection.contains("少少");
        System.out.println(collection1);
        boolean collection2 = collection.contains("少少2");
        System.out.println(collection2);
        System.out.println(collection.size());

        collection.remove("少少");
        System.out.println(collection.size());

        System.out.println(collection.isEmpty());
        collection.add(100);
        Object [] objects = collection.toArray();
        for (int i = 0; i <objects.length ; i++) {
            System.out.print(objects[i]+" ");
        }
    }
}

class student{

}
