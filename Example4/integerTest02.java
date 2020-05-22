package Example4;

public class integerTest02 {
    public static void main(String[] args) {
        //装箱
        Integer integer = new Integer(123);
        //拆箱
        int i = integer.intValue();
        System.out.println(i);
        float f= integer.intValue();
        System.out.println(f);
    }
}
