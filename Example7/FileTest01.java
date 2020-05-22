package Example7;

import java.io.File;
import java.io.FileReader;

public class FileTest01 {
    public static void main(String[] args) throws Exception{
        File f1 = new File("F:\\java IO流文件放置\\file");
        System.out.println(f1.exists());
        //以文件的形式存在
      /*  if (!f1.exists()) {
            f1.createNewFile();
        }*/
      //以目录的形式存在
        if (!f1.exists()){
            f1.mkdir();
        }
        File f2 = new File("F:\\java IO流文件放置\\file\\a\\v\\c\\a\\d\\f");
      /*  if (!f2.exists()){
            f2.mkdirs();
        }*/
      File f3 = new File("F:\\java IO流文件放置\\file");
        System.out.println(f3.getParent());

        File parentFile =f3.getParentFile();
        System.out.println("获取绝对路径"+parentFile.getAbsolutePath());

        File f4= new File("file");
        System.out.println(f4.getAbsoluteFile());
    }
}
