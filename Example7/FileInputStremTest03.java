package Example7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStremTest03 {
    public static void main(String[] args) {
        FileInputStream fis=null;
        try {
            fis = new FileInputStream("F:/ideaworkspace/src/tempfile");
            byte [] bytes = new byte[4];
            int readCount = fis.read(bytes);
            System.out.println(readCount);
            System.out.println(new String(bytes,0,readCount));

            readCount = fis.read(bytes);
            System.out.println(readCount);
            System.out.println(new String(bytes,0,readCount));

            readCount = fis.read(bytes);
            System.out.println(readCount);
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
