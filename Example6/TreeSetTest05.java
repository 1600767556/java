package Example6;

import HomeWorke.WuZIFighter;

import java.util.Comparator;
import java.util.TreeSet;
/*
TreeSet 集合中元素可排序的第二种方式： 用比较器的方式 comparator
最终的结论：
    放到TreeSet集合中或者TreeMap集合key部分的元素先要做到排序,有以下两种方式
    第一种:放在集合中的元素实现jva.lang.Comparatable接口
    第二种:在构造TreeSet或者TreeMp集合的时候给他传一个比较器对象
* */
public class TreeSetTest05 {
    public static void main(String[] args) {
        //TreeSet<WuGui> treeSet = new TreeSet<>();  这样不行没有通过构造方法传递参数
        //给构造方法传递比较器

        //匿名内部类直接new 接口
        TreeSet<WuGui> treeSets= new TreeSet<>(new Comparator<WuGui>() {
            @Override
            public int compare(WuGui o1, WuGui o2) {
                return o1.age-o2.age;
            }
        });
        treeSets.add(new WuGui(10000));
        treeSets.add(new WuGui(10));
        treeSets.add(new WuGui(100));
        for (WuGui t: treeSets
             ) {
            System.out.println(t);
        }

    }
}
class WuGui{
int age;

    public WuGui(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "WuGui{" +
                "age=" + age +
                '}';
    }
}

/*
也可以使用匿名内部类的方式
class WuGuiComparator implements Comparator<WuGui>{

    @Override
    public int compare(WuGui o1, WuGui o2) {
        return o1.age-o2.age;
    }
}*/
