package HomeWorke;

import java.util.Arrays;

public class Army {
    private Weapon [] weapons;



    public Army(int count) {
        weapons= new Weapon[count];
    }

public void addWeapon(Weapon weapon) throws AddWeaponException {
    for (int i = 0; i <weapons.length ; i++) {
if (null == weapons[i]){
    weapons[i] = weapon;
    System.out.println(weapon + "武器添加成功");
    return;
}
    }
    //程序执行到此处说明,武器没有添加成功
    throw new AddWeaponException("武器数量已经达到上限!");
}
//所有课攻击的武器攻击
public void attackAll(){
//遍历数组
    for (int i = 0; i <weapons.length ; i++) {
        if (weapons[i] instanceof Shootable){
            Shootable shootable = (Shootable)weapons[i];
            shootable.shoot();
        }
    }
}
//所有可移动的武器可移动
    public void moveAll(){
        for (int i = 0; i <weapons.length ; i++) {
            if (weapons[i] instanceof Moveable){
                Moveable moveable = (Moveable)weapons[i];
                moveable.Move();
            }
        }
    }

}
