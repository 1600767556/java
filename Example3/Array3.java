package Example3;



import java.util.Calendar;

public class Array3 {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        Animal a2 = new Animal();
        Animal [] animals = {a1,a2};
        for (int i = 0; i <animals.length ; i++) {
           // System.out.println(animals[i]);
            animals[i].move();

        }

        Animal [] animals1 = new Animal[3];
        animals1[0] = new Animal();
        animals1[1] = new Pig();
        animals1[2] = new Pig2();


        Animal [] animals2 = {new Pig(),new Pig2()};

        for (int i = 0; i <animals2.length ; i++) {

     if (animals2[i] instanceof Pig){
         Pig p= (Pig)animals2[i];
         p.matchMouse();

     }else if (animals2[i] instanceof Pig2){
         Pig2 p2 =(Pig2)animals2[i];
         p2.sing();
     }
        }
    }
}
//动物类
class Animal {
    public void move() {
        System.out.println("Animal move......");
    }
}
    //商品类
class Product{

}
class Pig extends Animal{
    @Override
    public void move() {
        System.out.println("猫在走猫步 ");
    }
    public void matchMouse(){
        System.out.println("猫可以抓老鼠");
    }
}
class Pig2 extends Animal{
    @Override
    public void move() {
        System.out.println("bird fly...");
    }
    public void sing(){
        System.out.println("鸟儿可以唱歌!");
    }
}