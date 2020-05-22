package Example4;

public class IntegerTest07 {
    public static void main(String[] args) {
        //String -> int
        int i1 = Integer.parseInt("123");
        System.out.println(i1+1);
        //int -> String
        String s2 = i1+"";
        System.out.println(s2+1);
        //int -> Integer 自动装箱
        Integer x =1000;
        //Integer -> int 自动拆箱
        int y = x;
        //String -> Integer
        Integer integer = Integer.valueOf("123");
        //Integer -> String
        String s = String.valueOf(integer);

    }
}
