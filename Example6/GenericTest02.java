package Example6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/*
* 自动类型推断机制 钻石表达式
* */
public class GenericTest02 {
    public static void main(String[] args) {
        List<Animal> list = new ArrayList<>();
        list.add(new Cat());
        list.add(new Bird());
        list.add(new Animal());
        Iterator<Animal> iterator = list.iterator();
        while (iterator.hasNext()){
            Animal animal = iterator.next();
            animal.move();
        }
        List<String > list1 = new ArrayList<>();
        list1.add("dadaaaaaaaaaaa");
        list1.add("abcdefghigklmn");
        Iterator<String> iterator1 = list1.iterator();
        while (iterator1.hasNext()){
            String string = iterator1.next();
            System.out.println(string+" ");
            String newString = string.substring(6);
            System.out.println(newString);

        }
    }
}
