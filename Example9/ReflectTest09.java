package Example9;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectTest09 {
    public static void main(String[] args) throws Exception{
        StringBuilder s = new StringBuilder();
        Class userServiceClass = Class.forName("Example9.bean.UserSrevice");
s.append(Modifier.toString(userServiceClass.getModifiers())+" class "+userServiceClass.getSimpleName()+"{\n");
Method[] methods = userServiceClass.getDeclaredMethods();
        for (Method method:methods
             ) {
            // public boolean login(String name,String passwrod){
            s.append("\t");
            s.append(Modifier.toString(method.getModifiers()));
            s.append(" ");
            s.append(method.getReturnType().getSimpleName());
            s.append(" ");
            s.append(method.getName());
            s.append("(");
            Class [] parameterTypes = method.getParameterTypes();
            if (parameterTypes.length!=0) {
                for (Class parameterType : parameterTypes
                ) {
                    s.append(parameterType.getSimpleName());
                    s.append(",");
                    s.deleteCharAt(s.length()-1);
                }

                s.append(")");

                s.append("{\n}\n");
            }else if (parameterTypes.length==0){
                for (Class parameterType : parameterTypes
                ) {
                    s.append(parameterType.getSimpleName());
                    s.append(",");

                }

                s.append(")");

                s.append("{\n}\n");
            }
        }

        System.out.println(s);
    }
}
