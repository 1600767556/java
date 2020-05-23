package Example9;
/*
重点  获取这个类的父类 已经实现了那些接口
 */
public class ReflectTest13 {
    public static void main(String[] args) throws Exception{
        Class c = Class.forName("java.lang.String");
        //获取String父类
        Class superClass = c.getSuperclass();
        System.out.println(superClass.getSimpleName());
        //获取String类的所有接口
        Class [] interfaces = c.getInterfaces();
        for (Class interface1:interfaces
             ) {
            System.out.println(interface1.getName());
        }

    }
}
