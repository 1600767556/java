package HomeWorke;

public class Test {
    public static void main(String[] args) {
        //构建军队
        Army army = new Army(4);
        //创建武器对象
        Fighter fighter = new Fighter();
        Fighter fighter2 = new Fighter();
        Tank tank = new Tank();
        GaoShePao gaoShePao = new GaoShePao();
        WuZIFighter wuZIFighter = new WuZIFighter();
        try {
            army.addWeapon(fighter);
            army.addWeapon(fighter2);
            army.addWeapon(tank);
            army.addWeapon(gaoShePao);
            army.addWeapon(wuZIFighter);
        } catch (AddWeaponException e) {
            System.out.println(e.getMessage());
        }
army.moveAll();
        army.attackAll();
    }


}
