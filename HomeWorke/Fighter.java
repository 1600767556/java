package HomeWorke;

public class Fighter extends Weapon implements Moveable,Shootable {
    @Override
    public void Move() {
        System.out.println("fighter move");
    }

    @Override
    public void shoot() {
        System.out.println("fighter shoot");
    }
}
