package Example9;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
/*
反编译


 */
public class ReflectTest06 {
    public static void main(String[] args) throws Exception{
        //创建这个是为了拼接字符串
        StringBuilder s = new StringBuilder();
Class classStudent = Class.forName("java.util.Date");
s.append(Modifier.toString(classStudent.getModifiers()) +" class "+classStudent.getSimpleName()+" {\n");
Field [] fields = classStudent.getDeclaredFields();
        for (Field f:fields
             ) {
            s.append("\t");
            s.append(Modifier.toString(f.getModifiers()));
            s.append(" ");
            s.append(f.getType().getSimpleName());
            s.append(" ");
            s.append(f.getName());
            s.append(";\n");

        }
s.append("}");
        System.out.println(s);
    }
}
