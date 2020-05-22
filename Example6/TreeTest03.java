package Example6;

import java.util.TreeSet;

public class TreeTest03 {
    public static void main(String[] args) {
        Person p1= new Person(30);
        Person p2= new Person(23);
        Person p3= new Person(36);
        Person p4= new Person(22);

        TreeSet<Person> treeSet = new TreeSet();
        treeSet.add(p1);
        treeSet.add(p2);
        treeSet.add(p3);
        treeSet.add(p4);

        for (Person p: treeSet
             ) {
            System.out.println(p);
        }



    }
}
class Person implements Comparable<Person>{
    int age;

    public Person(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        return this.age-o.age;
    }
}
