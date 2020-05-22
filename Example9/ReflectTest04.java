package Example9;

public class ReflectTest04 {
    public static void main(String[] args) {
        try {
            Class c = Class.forName("Example9.MyClass");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
class MyClass{
    static {
        System.out.println("MyClass类的静态代码块执行了");
    }

}
