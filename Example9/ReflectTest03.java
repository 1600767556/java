package Example9;

import Example9.bean.User;

import java.io.FileReader;
import java.util.Properties;

/*
验证反射机制的灵活性
 */
public class ReflectTest03 {
    public static void main(String[] args) throws Exception{
        FileReader reader = new FileReader("F:\\ideaworkspace\\src\\Example9\\classinfo.properties");
        Properties pro = new Properties();
            pro.load(reader);
            reader.close();
            String classname = pro.getProperty("className");
       System.out.println(classname);
        Class c1 = Class.forName(classname);
        Object obj = c1.newInstance();
        System.out.println(obj);
    }
}
