package Example9;

import java.util.Date;

/*
获取文件的三种方法
 */
public class ReflectTest01 {
    public static void main(String[] args) {
        Class c1 = null;
        Class c2=null;
        try {
            c1 = Class.forName("java.lang.String");
            c2 = Class.forName("java.util.Date");
            Class c3 = Class.forName("java.lang.Integer");
            Class c4 = Class.forName("java.lang.System");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


        String s = "abc";
        Class x = s.getClass();
        System.out.println(x==c1);

        Date date = new Date();
        Class d2 = date.getClass();
        System.out.println(d2==c2);

        Class v = String.class;
        Class b = Double.class;
        System.out.println(v==x);
    }
}
