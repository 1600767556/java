package Example9;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

public class ReflectTest11 {
    public static void main(String[] args) throws Exception{
        StringBuilder s = new StringBuilder();
Class vipClass = Class.forName("java.lang.String");
        // public Vip(int no, String name, String birth, boolean sex) {
s.append(Modifier.toString(vipClass.getModifiers()));
s.append(" class ");
s.append(vipClass.getSimpleName());
s.append("{\n");

//拼接构造方法

        Constructor [] constructors = vipClass.getDeclaredConstructors();
        for (Constructor constructor:constructors
             ) {
s.append(Modifier.toString(constructor.getModifiers()));
s.append(" ");
s.append(vipClass.getSimpleName());
s.append("(");

Class[] parameterTypes = constructor.getParameterTypes();
            for (Class parameterType:parameterTypes
                 ) {
                s.append(parameterType.getSimpleName());
                s.append(",");
            }
            if (parameterTypes.length>0){
                s.deleteCharAt(s.length()-1);
            }

s.append("){}\n");

        }
        s.append("}");
        System.out.println(s);

    }
}
