package Example5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionTest04 {
    public static void main(String[] args) {
        System.out.println("main begin");
        try {
            m1();
        } catch (FileNotFoundException e) {
            //e.printStackTrace();
            System.out.println(e);
            System.out.println("文件不存在,可能路径错误");
        }
        System.out.println("main over");
    }

    private static void m1() throws FileNotFoundException {
        System.out.println("main1 begin");
        m2();
        System.out.println("main1 over");

    }

    private static void m2() throws FileNotFoundException {
        System.out.println("main2 begin");
        m3();
        System.out.println("main2 over");

    }

    private static void m3() throws FileNotFoundException {
        new FileInputStream("F:\\java-书\\1.txt");
        System.out.println("如果以上代码出现异常,这里不会执行!");
    }
}
