package Example9;

import javax.jws.Oneway;
import java.lang.reflect.Field;
/*
重点 通过反射机制怎么调用一个对象的属性
 */
public class ReflectTest07 {
    public static void main(String[] args) throws Exception{
        Class studentClass = Class.forName("Example9.bean.Student");
        Object obj = studentClass.newInstance();//student对象
        //获取no属性
        Field noField = studentClass.getDeclaredField("no");
        //设置no值
        noField.set(obj,2222);
        //获取no值
        System.out.println(noField.get(obj));

        //访问私有属性
        Field nameField = studentClass.getDeclaredField("name");
        //打破封装
        nameField.setAccessible(true);

        nameField.set(obj,"hu");

        System.out.println(nameField.get(obj));
    }
}
