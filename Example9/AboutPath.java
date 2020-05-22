package Example9;

import java.io.FileReader;
/*
研究一下文件路径的问题
 */
public class AboutPath {
    public static void main(String[] args) throws Exception{
        //FileReader reader = new FileReader("F:\\ideaworkspace\\src\\Example9\\classinfo.properties");
String path = Thread.currentThread().getContextClassLoader().getResource("Example9/classinfo2.properties").getPath();
        System.out.println(path);
       String  path2 = Thread.currentThread().getContextClassLoader().getResource("Example9/bean/db.properties").getPath();
        System.out.println(path2);
    }
}
