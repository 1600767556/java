package Example7;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileTest02 {
    public static void main(String[] args) {
        File f1 = new File("F:\\java IO流文件放置\\2.mp4");
        System.out.println("文件名"+f1.getName());
        //判断是不是文件
        System.out.println(f1.isFile());
        //判断是不是目录
        System.out.println(f1.isDirectory());
        //获取文件最后一次修改时间
        long lastModified = f1.lastModified();
        Date time = new Date(lastModified);
        System.out.println(time);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");

        System.out.println(simpleDateFormat.format(time));
        System.out.println(f1.length());
    }
}
