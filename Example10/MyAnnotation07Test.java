package Example10;

import java.lang.reflect.Field;

public class MyAnnotation07Test {
    public static void main(String[] args) throws Exception{
        //获取类
        Class c = Class.forName("Example10.User");
        //判断类上是否有id注解
        if (c.isAnnotationPresent(MyAnnoTation07.class));
        //获取类的属性
        Field [] fields = c.getDeclaredFields();
        boolean isOk =false;
        for (Field field:fields
             ) {
            if ("id".equals(field.getName())&&"int".equals(field.getType().getSimpleName())){
                isOk=true;
                break;
            }

        }
        //判断是否合法
        if (!isOk){
            throw new HasNotPropertyException("被@id注解标注的类中必须有一个int类型的id属性");

        }
    }


}
