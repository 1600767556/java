package Example7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStremTest02 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("F:\\java IO流文件放置\\temp.txt");
           /* while (true){
                int readData = fis.read();
                if (readData == -1){
                    break;
                }
                System.out.println(readData);
                            }*/
            //while 改造
            int readData = 0;
            while ((readData = fis.read()) !=-1){
                System.out.println(readData);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
