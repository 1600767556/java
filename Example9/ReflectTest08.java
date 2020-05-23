package Example9;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectTest08 {
    public static void main(String[] args) throws Exception{
Class userServiceClass = Class.forName("Example9.bean.UserSrevice");
Method [] methods = userServiceClass.getDeclaredMethods();
        System.out.println(methods.length);
        //遍历method
        for (Method me:methods
             ) {
            //获取修饰符
            System.out.println(Modifier.toString(me.getModifiers()));

            //获取返回值类型
            System.out.println(me.getReturnType().getSimpleName());
            //获取方法名
            System.out.println(me.getName());
            //方法的修饰符列表
            Class [] classes =me.getParameterTypes();
            for (Class classe:classes
                 ) {
                System.out.println(classe.getSimpleName());
            }
        }
    }
}
