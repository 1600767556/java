package Example4;

public class IntegerTest05 {
    public static void main(String[] args) {
        //自动装箱
        Integer x = 100;
        System.out.println(x);
        //自动拆箱
        int x1 = x;
        System.out.println(x1);
        Integer integer = 1000;
        System.out.println(integer+1);
        Integer integer1=100;
        Integer integer2=100;
        System.out.println(integer1==integer2);
    }
}
