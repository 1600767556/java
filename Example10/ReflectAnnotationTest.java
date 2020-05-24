package Example10;

public class ReflectAnnotationTest {
    public static void main(String[] args) throws Exception {
        Class c = Class.forName("Example10.MyAnnotation05Test");
        //判断类上面是否有Annotation
        System.out.println(c.isAnnotationPresent(MyAnnotation05.class));
        if (c.isAnnotationPresent(MyAnnotation05.class)) {
            //获取该注解对象
            MyAnnotation05 myAnnotation05 = (MyAnnotation05) c.getAnnotation(MyAnnotation05.class);
            System.out.println("类上面的注解对象" + myAnnotation05);
            //获取注解对象的属性
            String value = myAnnotation05.value();
            System.out.println(value);
        }
    }
}
