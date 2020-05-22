package Example5;

public class ExceptionTest05 {
    public static void main(String[] args) {
        NullPointerException npe = new NullPointerException("空指针异常aa");
        String msg = npe.getMessage();
        System.out.println(msg);
        //打印异常信息
        npe.printStackTrace();
        for (int i = 0; i <1000 ; i++) {
            System.out.println(i);
        }
        System.out.println("aaaa");
    }
}
