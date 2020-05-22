package Example2;

public class InterfaceCook {
    public static void main(String[] args) {
        //创建厨师对象m
menu m = new ChineseCooker();
menu m2 = new AmericaCooker();
//创建顾客对象
customer c1 = new customer(m);
customer c2 =new customer(m2);
c1.order();
c2.order();
/*m.menu1();
m2.menu2();*/
    }
}

//菜单接口
interface menu{
 void menu1();
void menu2();
}
//中餐师傅
class ChineseCooker implements menu{

    @Override
    public void menu1() {
        System.out.println("中餐师傅做食物1");
    }

    @Override
    public void menu2() {
        System.out.println("中餐师傅做食物2");
    }
}
//西餐师傅
class AmericaCooker implements menu{

    @Override
    public void menu1() {
        System.out.println("西餐师傅做食物1");
    }

    @Override
    public void menu2() {
        System.out.println("西餐师傅做食物2");
    }
}


class customer{
    private menu m;

    public customer(menu m) {
        this.m = m;
    }

    public menu getM() {
        return m;
    }

    public void setM(menu m) {
        this.m = m;
    }
    //点菜的方法
    public void order(){
menu me = this.getM();
me.menu2();
me.menu1();

    }
}