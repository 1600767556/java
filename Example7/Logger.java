package Example7;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;
/*
日志
 */
public class Logger {
   public static void log(String msg){
       try {
           System.setOut(new PrintStream(new FileOutputStream("F:\\java IO流文件放置\\log.txt",true)));
           Date date = new Date();
           SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yy-MM-dd HH:mm:ss:SSS");
           String strTime = simpleDateFormat.format(date);
           System.out.println(strTime+" "+msg);
       } catch (FileNotFoundException e) {
           e.printStackTrace();
       }

   }
}
