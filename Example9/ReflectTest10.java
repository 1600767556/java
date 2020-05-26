package Example9;


import Example9.bean.UserService ;

import java.lang.reflect.Method;

/*
重点 通过反射机制怎么调用一个对象的方法
 */
public class ReflectTest10 {

    public static void main(String[] args) throws Exception{
        //不使用反射机制怎么掉用方法
        UserService userService = new UserService();
        boolean loginSuccess = userService.login("admin","123");
        //System.out.println(loginSuccess);
        System.out.println(loginSuccess?"登录成功":"登录失败");

        //使用反射机制来调用一个方法
        Class userServiceClass = Class.forName("Example9.bean.UserService");
        //创建对象
        Object obj = userServiceClass.newInstance();
        //获取method
        Method loginMethod = userServiceClass.getDeclaredMethod("login", String.class, String.class);
        Method loginMethod2 = userServiceClass.getDeclaredMethod("login", int.class);
        Object retValue = loginMethod.invoke(obj,"admin","123");
        System.out.println(retValue);

    }
}
