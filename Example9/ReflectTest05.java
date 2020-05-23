package Example9;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class ReflectTest05 {
    public static void main(String[] args) throws Exception{
Class studentClass = Class.forName("Example9.bean.Student");
String name = studentClass.getName();
        System.out.println("完整类名"+name);
        String simName = studentClass.getSimpleName();
        System.out.println("简类名"+simName);
        Field[] field = studentClass.getFields();
        System.out.println(field.length);
        Field f1  = field[0];
        String s =f1.getName();
        System.out.println(s);
        System.out.println("==========================");
        Field [] fields = studentClass.getDeclaredFields();
        for (Field f:fields
             ) {

            int i = f.getModifiers();
            System.out.println(i);
            String modefierTostring = Modifier.toString(i);
            System.out.println(modefierTostring);
            Class fType = f.getType();
            String fName = fType.getSimpleName();
            System.out.println(fName);


            System.out.println(f.getName());
        }
    }
}
