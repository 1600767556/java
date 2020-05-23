package Example9;

import Example9.bean.Vip;

import java.lang.reflect.Constructor;

//重点一点
//通过反射机制构造方法实例化java对象
public class ReflectTest12 {
    public static void main(String[] args) throws Exception{
//不使用反射机制创建对象
        Vip vip = new Vip();
        Vip vip1 = new Vip(100,"shaoshao","2000-11-23",true);

        //使用反射机制创建对象
        Class c = Class.forName("Example9.bean.Vip");
        //调用无参数构造方法
        Object obj = c.newInstance();
        System.out.println(obj);
        //获取有参数的构造方法
        Constructor con = c.getDeclaredConstructor(int.class,String.class,String.class,boolean.class);

        //调用构造方法new对象
        Object obj1 = con.newInstance(100,"shaosiming","2000-11-23",false);
        System.out.println(obj1);

        //获取无参数构造
        Constructor constructor = c.getDeclaredConstructor();
        Object obj2 = constructor.newInstance();
        System.out.println(obj2);
    }
}
