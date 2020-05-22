package Example5;

public class ExceptionTest03 {
    //第一种处理方式 :在方法声明的位置上继续使用throws,来完成异常的继续上抛.抛给调用者
    /*public static void main(String[] args) throws ClassNotFoundException {
doSome();
    }*/
    //Unhandled exception: java.lang.ClassNotFoundException

    //第二种处理方式:用try catch 进行捕捉
    public static void main(String[] args) {
        try {
            doSome();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void doSome() throws ClassNotFoundException{
        System.out.println("doSome!!!");
    }
}
