package CollectionReview;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Objects;
import java.util.TreeSet;
//可排序 不可重复
public class TreeSetTest {
    public static void main(String[] args) {
        //传入比较器可以改变排序规则

        TreeSet<Integer> treeSet = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        treeSet.add(10);
        treeSet.add(0);
        treeSet.add(54);
        treeSet.add(54);
        treeSet.add(54);
        treeSet.add(12);
        Iterator<Integer> integerIterator = treeSet.iterator();
        while (integerIterator.hasNext()){
            System.out.println(integerIterator.next());
        }

        for (Integer i:treeSet
             ) {
            System.out.println(i);
        }




        TreeSet<A> aSet = new TreeSet<>();
        aSet.add(new A(100));
        aSet.add(new A(50));
        aSet.add(new A(300));
        aSet.add(new A(160));
        aSet.add(new A(140));
Iterator<A> aIterator = aSet.iterator();
while (aIterator.hasNext()){
    System.out.println(aIterator.next());
}

        for (A b:aSet
             ) {
            System.out.println(b);
        }


        TreeSet<B> treeSet1 = new TreeSet<>(new BComparator());

//匿名内部类
/*TreeSet<B> treeSet1 = new TreeSet<>(new Comparator<B>() {
    @Override
    public int compare(B o1, B o2) {
        return o1.i-o2.i;
    }
});*/
treeSet1.add(new B(100));
treeSet1.add(new B(300));
treeSet1.add(new B(200));
treeSet1.add(new B(150));
Iterator<B> iterator = treeSet1.iterator();
while (iterator.hasNext()){
    System.out.println(iterator.next());
}
        for (B b:treeSet1
             ) {
            System.out.println(b);
        }

    }
}
class A implements Comparable<A>{
    int i;

    public A(int i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return "A{" +
                "i=" + i +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        A a = (A) o;
        return i == a.i;
    }

    @Override
    public int hashCode() {
        return Objects.hash(i);
    }

    @Override
    public int compareTo(A o) {
        return this.i-o.i;
    }
}

class B {
    int i;

    public B(int i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return "B{" +
                "i=" + i +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        B b = (B) o;
        return i == b.i;
    }

    @Override
    public int hashCode() {
        return Objects.hash(i);
    }
}
//比较器
class BComparator implements Comparator<B>{


    @Override
    public int compare(B o1, B o2) {
        return o1.i-o2.i;
    }
}