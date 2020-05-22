package Example7;

import java.io.FileReader;
import java.util.Properties;
/*
属性配置文件
 */
public class IoProperitiesTest01 {
    public static void main(String[] args) throws Exception{
        //创建一个输入流对象
        FileReader reader = new FileReader("F:\\java IO流文件放置\\userinfo.txt");
        //新建一个map集合
        Properties pro = new Properties();

        pro.load(reader);
        String username = pro.getProperty("username");
        System.out.println(username);
        String password = pro.getProperty("password");
        System.out.println(password);


    }
}
