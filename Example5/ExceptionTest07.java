package Example5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest07 {
    public static void main(String[] args) {
        /*try {
            FileInputStream fileInputStream = new FileInputStream("F:\\java-书\\1.txt");
        } catch (FileNotFoundException e) {
            //e.printStackTrace();
            System.out.println("文件不存在");
        }*/
        try {
            //创建输入流
            FileInputStream fileInputStream = new FileInputStream("F:\\java-书\\1.txt");
            fileInputStream.read();
            //多个catch 必须从小到大
        } catch (FileNotFoundException e) {
            //e.printStackTrace();
            System.out.println("文件不存在");

        }catch (IOException e){
            System.out.println("读文件报错了");
        }
    }
}
