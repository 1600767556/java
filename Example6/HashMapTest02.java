package Example6;

import java.util.HashSet;
import java.util.Set;
/*
* 向map中存或者取都是先调用hashcode方法在调用equals方法
* equals 也有可能不调用
* 拿put(key,value) 和 get(k)
* 数组下标为null就不调用equals
* */
public class HashMapTest02 {
    public static void main(String[] args) {
    Student02 student = new Student02();
    Student02 student1 = new Student02();
        System.out.println(student.equals(student1));
        System.out.println(student.hashCode());
        System.out.println(student1.hashCode());
        Set<Student02> set = new HashSet<>();
        set.add(student);
        set.add(student1);
        System.out.println(set.size());

    }
}
