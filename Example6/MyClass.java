package Example6;

import java.util.HashSet;
import java.util.Set;

public class MyClass {
    //静态内部类
    private static class innerClass{
public static void m1(){
    System.out.println("静态内部类");

}

        public void m2(){
            System.out.println("静态内部类中的实例方法执行!");
        }
    }


    public static void main(String[] args) {
        MyClass.innerClass mi = new MyClass.innerClass();
        mi.m2();
        MyClass.innerClass.m1();
        Set<MyClass.innerClass> set = new HashSet<>();
        
    }
}

