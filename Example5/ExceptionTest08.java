package Example5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionTest08 {
    public static void main(String[] args) {
        try {
            m1();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            String a = e.getMessage();
            System.out.println(a);
        }
        System.out.println("Hello World");
    }

    private static void m1() throws FileNotFoundException {
        m2();
    }

    private static void m2() throws FileNotFoundException {
        m3();
    }

    private static void m3() throws FileNotFoundException {

        new FileInputStream("F:\\java-书\\1.txt");
    }
}
