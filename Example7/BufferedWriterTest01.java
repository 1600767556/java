package Example7;

import java.io.*;

public class BufferedWriterTest01 {
    public static void main(String[] args) throws Exception{
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("file"));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("file",true)));

bufferedWriter.write("HelloWorld");
bufferedWriter.write("woshi");
bufferedWriter.write("\n");
bufferedWriter.write("huxinlaing");
bufferedWriter.flush();
bufferedWriter.close();
    }
}
