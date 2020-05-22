package Example9;

import java.io.FileReader;
import java.io.InputStream;
import java.util.Properties;

public class IoPropertiesTest {
    public static void main(String[] args) throws Exception{
        //获取一个文件的绝对路径 有两种方式
        /*String path = Thread.currentThread().getContextClassLoader().getResource("Example9/classinfo2.properties").getPath();
        FileReader fileReader = new FileReader(path);*/
       InputStream path = Thread.currentThread().getContextClassLoader().getResourceAsStream("Example9/classinfo2.properties");
        Properties properties = new Properties();
        properties.load(path);
        path.close();
        String classname = properties.getProperty("className");
        System.out.println(classname);

    }
}
