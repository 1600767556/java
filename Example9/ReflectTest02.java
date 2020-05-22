package Example9;

public class ReflectTest02 {
    public static void main(String[] args) {
        //通过反射机制获取class,通过Class来实例化对象
        try {
            Class c = Class.forName("Example9.bean.User");
            Object obj = c.newInstance();
            System.out.println(obj);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
