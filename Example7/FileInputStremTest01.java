package Example7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//文件字节输入流
//读的操作硬盘--->内存
public class FileInputStremTest01 {
    public static void main(String[] args) {
//创建文件字节输入对象
        FileInputStream fileInputStream=null;
        try {
             fileInputStream = new FileInputStream("F:\\java IO流文件放置\\temp.txt");
             int readDta = fileInputStream.read();
            System.out.println(readDta);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if ( fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
