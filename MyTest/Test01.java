package MyTest;
public class Test01 {


    //第三题
    byte b;
    short s;
    int i;
    long l;
    public static void main(String[] args) {
        String name = "这里写你的名字";
        System.out.println(name);


    getDefault();
    getSize();
    }

    public static void getDefault(){

        Test01 a = new Test01();
    System.out.println("byte的二进制位数默认值"+a.b);
    System.out.println("short的二进制位数默认值"+a.s);
    System.out.println("int的二进制位数默认值"+a.i);
    System.out.println("long的二进制位数默认值"+a.l);

}
    public static void getSize(){
    System.out.println("----------------------");

    System.out.println("byte的二进制位数最大值：" + Byte.MAX_VALUE);
    System.out.println("byte的二进制位数最小值：" + Byte.MIN_VALUE);
    System.out.println("--------------------");

    System.out.println("short的二进制位数最大值：" + Short.MAX_VALUE);
    System.out.println("short的二进制位数最小值：" + Short.MIN_VALUE);
    System.out.println("--------------------");

    System.out.println("int的二进制位数最大值：" + Integer.MAX_VALUE);
    System.out.println("int的二进制位数最小资和：" + Integer.MIN_VALUE);
    System.out.println("--------------------");

    System.out.println("long的二进制位数最大值：" + Long.MAX_VALUE);
    System.out.println("long的二进制位数最小值：" + Long.MIN_VALUE);

}
}
