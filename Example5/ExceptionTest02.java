package Example5;

public class ExceptionTest02 {
    public static void main(String[] args) {
        //通过异常类实例化异常对象
        NumberFormatException nfe = new NumberFormatException("数字格式化异常");
        System.out.println(nfe);
        NullPointerException npe = new NullPointerException("空指针异常");
        System.out.println(npe);
    }
}
