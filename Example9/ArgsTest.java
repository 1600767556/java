package Example9;
/*
可变长度参数个数个0-n
只能在最后面，而且只能有一个
 */
public class ArgsTest {
    public static void main(String[] args) {
m();
m(10,20);
m2(100,"ac");
m3("aa","vv","cc","dd");

String [] str = {"a","v","c"};
m3(str);
    }
    public static void m(int ... args){
        System.out.println("m方法执行了");
    }
   // public static void m2(int ... args2,String ... args1){ }
   public static void m2(int n,String ... args1){

   }
    public static void m3(String ... args1){
        //args有length属性，说明args是一个数组
        for (int i = 0; i <args1.length ; i++) {
            System.out.println(args1[i]);
        }
    }
}
