package Example4;

public class IntegerTest06 {
    public static void main(String[] args) {
        int integer = Integer.parseInt("123");
        System.out.println(integer+100);
        double double1 = Double.parseDouble("3.14");
        System.out.println(double1+1);
        Integer integer1 = Integer.valueOf(100);
        Integer integer2 =  Integer.valueOf("100");
        System.out.println(integer1);
        System.out.println(integer2);
        String string =  Integer.toOctalString(8);
        System.out.println(string);
        System.out.println();
    }
}
