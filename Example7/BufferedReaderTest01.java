package Example7;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest01 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("file");
        BufferedReader bf = new BufferedReader(fr);
        String s = null;

        while ((s = bf.readLine())!=null){
            System.out.println(s);
        }
        bf.close();
    }
}
