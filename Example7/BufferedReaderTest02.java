package Example7;

import java.io.*;

public class BufferedReaderTest02 {
    public static void main(String[] args) throws IOException {
        /*FileInputStream in = new FileInputStream("file");
        InputStreamReader inputStreamReader = new InputStreamReader(in);
        BufferedReader bf = new BufferedReader(inputStreamReader);*/
        BufferedReader bf = new BufferedReader(new InputStreamReader(new FileInputStream("file")));
        String line = null;
        while ((line = bf.readLine())!=null){
            System.out.println(line);
        }
        bf.close();
    }
}
