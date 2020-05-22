package Example6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenericTest01 {
    public static void main(String[] args) {
    /* 没有使用泛型
     List list = new ArrayList();
        Cat cat = new Cat();
        Bird bird = new Bird();
        list.add(cat);
        list.add(bird);
        Iterator iterator =list.iterator();
        while (iterator.hasNext()){
            Object object = iterator.next();
            if (object instanceof Animal){
                Animal animal = (Animal)object;
                animal.move();
            }
            if (object instanceof Bird){
                Bird bird1 = (Bird)object;
                bird1.fly();
            }else if (object instanceof Cat){
               Cat cat1 = (Cat)object;
               cat1.catchMouse();
            }
        }*/


    //使用泛型
        List<Animal> list = new ArrayList<Animal>();

        //list.add("dada"); 错误 只能存储Animal
        Cat cat = new Cat();
        Bird bird = new Bird();

        list.add(cat);
        list.add(bird);

        Iterator<Animal> iterator = list.iterator();
        while (iterator.hasNext()){
            Animal animal = iterator.next();
            //animal.move();
            if (animal instanceof Cat){
                Cat cat1 = (Cat)animal;
                cat1.catchMouse();
            }if (animal instanceof Bird){
                Bird bird1 = (Bird)animal;
                bird1.fly();
            }
        }


    }
}
class Animal{
    private String name;
public void move(){
    System.out.println("动物在移动!");
}
}

class Cat extends Animal{
    public void catchMouse(){
        System.out.println("猫捉老鼠");
    }

}
class Bird extends Animal {
    public void fly() {
        System.out.println("鸟儿在飞翔");
    }
}