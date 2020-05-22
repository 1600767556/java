package Example5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionTest06 {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("F:\\java-书\\1.txt");
            System.out.println(10/0);
        } catch (FileNotFoundException | ArithmeticException | NullPointerException e) {
            System.out.println("文件不存在?数字异常?空指针异常?都有可能!");
        }
    }
}
