package Example7;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FlierReaderTest01 {
    public static void main(String[] args) {
        FileReader reader = null;
        try {
            reader = new FileReader("F:/ideaworkspace/src/tempfile");
           /*char [] chars = new char[4];
            reader.read(chars);
            for (char c: chars
                 ) {
                System.out.println(c);
            }*/
          char [] chars = new char[4];
            int readerCount=0;
            while ((readerCount = reader.read(chars))!=-1){
                System.out.print(new String(chars,0,readerCount));
            }



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}


/*
*  while ((readerCount = reader.read(chars)!=-1){
                System.out.println(new String(chars,0,readerCount));
            }
*
*
*    while ((readerCount = reader.read(chars) != -1){
                System.out.print(new String(chars,0,readerCount));
            }
* */