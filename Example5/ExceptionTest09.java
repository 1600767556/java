package Example5;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest09 {
    public static void main(String[] args) {
        FileInputStream fileInputStream=null;
        try {
            //创建输入流
             fileInputStream = new FileInputStream("F:\\java-书\\1.txt");
           //一定出现空指针异常
            String  s = null;
            s.toString();
            System.out.println("Hello World!");
           // fileInputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }catch (NullPointerException e){
            e.printStackTrace();
        } finally {
            System.out.println("Hollo 啊啊啊");
            if (fileInputStream != null) {//避免空指针异常
                try {
                    //close 方法有异常 ,采用捕捉的方式
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
        System.out.println("Hello kaitty");
    }
}
