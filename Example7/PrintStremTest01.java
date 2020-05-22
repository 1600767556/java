package Example7;

import java.io.FileOutputStream;
import java.io.PipedReader;
import java.io.PrintStream;

public class PrintStremTest01 {
    public static void main(String[] args) throws Exception{
        //联合起来写
        System.out.println("Hello World!");
        //分开写
            PrintStream ps=  System.out;
            ps.println("Hello World");
            ps.println("hello lisi");
            //PrintStream printStream = (new PrintStream(new FileOutputStream("F:\\java IO流文件放置\\log")));
           /* System.gc();
            System.currentTimeMillis();*/
       // System.setOut(printStream);
        System.setOut(new PrintStream(new FileOutputStream("F:\\java IO流文件放置\\log")));
        System.out.println("hello World");
        System.out.println("hello Kitty");

    }
}
