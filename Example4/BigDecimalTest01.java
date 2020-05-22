package Example4;


import java.math.BigDecimal;

//大数据精度极高，不属于基本数据类型，属于引用数据类型
public class BigDecimalTest01 {
    public static void main(String[] args) {
        BigDecimal b1 = new BigDecimal(100);
        BigDecimal b2 = new BigDecimal(200);
        BigDecimal b3 = b1.add(b2);
        System.out.println(b3);
        BigDecimal b4 = b2.divide(b1);
        System.out.println(b4);
    }
}
