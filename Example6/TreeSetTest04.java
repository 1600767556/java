package Example6;

import java.util.TreeSet;

public class TreeSetTest04 {
    public static void main(String[] args) {
        TreeSet<Vip> treeSet = new TreeSet<>();
        treeSet.add(new Vip(23,"hu"));
        treeSet.add(new Vip(25,"hua"));
        treeSet.add(new Vip(30,"huxin"));
        treeSet.add(new Vip(28,"huxinliang"));
        treeSet.add(new Vip(25,"huda"));

        for (Vip v:treeSet
             ) {
            System.out.println(v);
        }
    }
}
class Vip implements Comparable<Vip>{
    int age;
    String name;

    public Vip(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Vip{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Vip o) {
        if (this.age==o.age){
            return this.name.compareTo(o.name);

        }else {
            return this.age-o.age;
        }
    }


}