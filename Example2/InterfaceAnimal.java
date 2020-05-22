package Example2;

public class InterfaceAnimal {
    public static void main(String[] args) {
        flyable c =new cat();
        c.fly();
        flyable p = new Pig();
        p.fly();
    }
}
class Animal{

}
interface flyable{
    void fly();
}
class cat extends Animal implements flyable{

    @Override
    public void fly() {
        System.out.println("这是一只会飞的猫咪哦");
    }
}
class fish  implements flyable{

    @Override
    public void fly() {
        System.out.println("我是流言蜚语");
    }
}
class Pig extends Animal implements flyable{

    @Override
    public void fly() {
        System.out.println("这是一只会飞的猪哦！");
    }
}