package example;
//测试类
public class Example8 {
    public static void main(String[] args) {

        Example8_1 e1 = new Example8_1();
        Example8_1 e4 = new Example8_1(12,"户");
        e1.eat();
        e1.name="胡";
        System.out.println(e1.name);
        Example8_1 e2 = new Example8_2();
        e2.eat();
        Example8_1 e3 = new Example8_3();
        e3.eat();
        e2.age=12;
        e1.age=10;
        e2.name = "狗";
        e1.name="毛";


        Example8_2 dog = new Example8_2();
        Example8_1 an = new Example8_2();
        if (an instanceof Example8_2) {
            Example8_2 dog2 = (Example8_2) an;
        }else{
            System.out.println("不能强制类型转换");
        }

        if (an instanceof Example8_3) {
           Example8_3 cat = (Example8_3) an;
        }else{
            System.out.println("不能强制类型转换");
        }
    }

}
