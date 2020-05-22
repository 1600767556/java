package Example6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/*
* 关于集合遍历 迭代专题
* */
public class CollectionTest02 {
    public static void main(String[] args) {
        //以下讲解的遍历方式/迭代方式,是所有collection通用的一种方式
        //在map集合中不能用.在所有的   collection以及子类中使用
        //创建集合对象
        Collection collection = new ArrayList();//后面的集合无所谓,主要是看前面的collection接口,怎么遍历 怎么迭代
        collection.add(123);
        collection.add("ada");
        collection.add(new Object());
        //获取集合对象的迭代器对象iterator
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()){
            Object object = iterator.next();
            System.out.println(object);
        }

        Collection collection1 = new HashSet();
        collection1.add(100);
        collection1.add("123a");
        collection1.add(100);
        collection1.add(new Object());
        Iterator iterator2 = collection1.iterator();
        while (iterator2.hasNext()){
            Object object = iterator2.next();
            System.out.println(object);
        }
    }
}
