package Example10;
@Deprecated
public class AnnotationTest03 {
    public static void main(String[] args) {
AnnotationTest03 at= new AnnotationTest03();
at.doSome();
AnnotationTest03.doOther();
    }

    @Deprecated
    private String name;

    @Deprecated//这个注解标注的元素已过时
    public static void doOther(){
        System.out.println("do other...");

    }
    @Deprecated
    public void doSome(){
        System.out.println("do some");
    }

}
class T{
    public static void main(String[] args) {
        AnnotationTest03 at = new AnnotationTest03();
        at.doSome();
        AnnotationTest03.doOther();
        try {
            Class c = Class.forName("java.lang.String");
           Object obj= c.newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}