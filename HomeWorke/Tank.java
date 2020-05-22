package HomeWorke;

public class Tank extends Weapon implements Moveable,Shootable{
    //坦克类

    @Override
    public void Move() {
        System.out.println("tank move");
    }

    @Override
    public void shoot() {
        System.out.println("tank shoot");
    }
}
