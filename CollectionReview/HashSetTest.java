package CollectionReview;

import com.sun.org.apache.xerces.internal.impl.xpath.XPath;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
//无序不可重复
public class HashSetTest {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("abc");
        set.add("def");
        set.add("king");
        //set 集合中的元素不能通过下标的方式取。没有下标
        Iterator<String> stringIterator = set.iterator();
        while (stringIterator.hasNext()){
            System.out.println(stringIterator.next());
        }
        for (String s:set
             ) {
            System.out.println(s);
        }
        set.add("king");
        set.add("king");
        set.add("king");
        System.out.println(set.size());

        HashSet<Student> hashSet = new HashSet<>();
        hashSet.add(new Student(100,"张三"));
        hashSet.add(new Student(120,"里斯"));
        hashSet.add(new Student(100,"张三"));
        System.out.println(hashSet.size());
        for (Student s:hashSet
             ) {
            System.out.println(s);
        }
    }
}
class Student{
    int no;
    String name;

    public Student() {
    }

    public Student(int no, String name) {
        this.no = no;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "no=" + no +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return no == student.no &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(no, name);
    }
}
