package Example6;

import java.util.*;

public class VectorTest {
    public static void main(String[] args) {
        //Vector vector = new Vector();
        List vector = new Vector();
        //默认容量10个
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);
        vector.add(6);
        //扩容是元容量的二倍
        //10--->20--->40
        //ArrayList
        //10--->15--->15*1.5--->15*1.5*1.5
        Iterator iterator = vector.iterator();
        while (iterator.hasNext()){
            Object o = iterator.next();
            System.out.println(o);
        }
        List myList = new ArrayList();//非线程安全的
        //线程安全的
        Collections.synchronizedCollection(myList);//线程安全的
        myList.add("111");
        myList.add("222");


    }
}
