package Example5;

public class ExceptionTest14 {
    public static void main(String[] args) {
        MyExceptionTest01 myExceptionTest01 = new MyExceptionTest01("用户名不能为空!");
        myExceptionTest01.printStackTrace();
        String s = myExceptionTest01.getMessage();
        System.out.println(s);
    }

}
