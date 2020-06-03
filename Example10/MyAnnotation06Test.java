package Example10;


import java.lang.reflect.Method;

public class MyAnnotation06Test {
    @MyAnnotation06(username = "admin",password = "123")
    public void doSome(){

    }

    public static void main(String[] args) throws Exception{
        Class c = Class.forName("Example10.MyAnnotation06Test");
        //获取doSome方法
        Method doSomeMethod = c.getDeclaredMethod("doSome");
        //判断是否存在这个注解
        if (doSomeMethod.isAnnotationPresent(MyAnnotation06.class)){
            MyAnnotation06 myAnnonaction06 = doSomeMethod.getAnnotation(MyAnnotation06.class);
            System.out.println(myAnnonaction06.username());
            System.out.println(myAnnonaction06.password());
        }
    }

}
