package Example7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStremTest05 {
    public static void main(String[] args) {
        FileInputStream fis= null;
        try {
            fis= new FileInputStream("F:/ideaworkspace/src/tempfile");
            System.out.println(fis.available());
            fis.skip(6);
            System.out.println(fis.read());
           // int readByte = fis.read();
            //System.out.println(readByte);
          /*  System.out.println(fis.available());
            byte [] bytes = new byte[fis.available()];
            int readCount = fis.read(bytes);
            System.out.println(new String(bytes));*/


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
