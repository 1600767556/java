package Example7;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyTest02 {
    public static void main(String[] args) {
        FileReader fileReader = null;
        FileWriter fileWriter = null;
        try {
            fileReader = new FileReader("F:\\ideaworkspace\\src\\Example7\\CopyTest02.java");
            fileWriter = new FileWriter("F:\\java IO流文件放置\\Copy02.java");
            char [] chars = new char[1024*512];
            int readCount = 0;
            while ((readCount = fileReader.read(chars))!=-1){
                fileWriter.write(chars,0,readCount);
            }
            fileWriter.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
