package Example2;


//猴子类
public class Example11 {
    public static void main(String[] args) {
        Example11 a = new Example11();
        int result = a.test();
        System.out.println("test() 方法执行完毕,返回:"+result);
        int result2 = a.test2();
        System.out.println(result2);
        System.out.println("test2()方法执行完毕,返回:"+result2);
        int result3 = a.test3();
        System.out.println("我想大声告诉你test3执行完毕"+result3);

    }
public int test(){
        int divider = 10;
        int result = 100;
        try {
    while (divider>-1){
        divider--;
        result += result/divider;
    }
    return result;
        }catch (Exception E){
            E.printStackTrace();
            System.out.println("循环跑出异常了");
        return -1;
        }
}public int test2(){
        int divider = 10;
        int result = 100;
        try {
            while (divider>-1){
                divider--;
                result += result/divider;
            }
            return result;
        }catch (Exception E) {
            E.printStackTrace();
            System.out.println("循环跑出异常了");
            return 999;

        }finally {
            System.out.println("这是finally");
            System.out.println(result);
        }
    }

    public int test3(){
        int divider = 10;
        int result = 100;
        try {
            while (divider>-1){
                divider--;
                result += result/divider;
            }

        }catch (Exception E) {
            E.printStackTrace();
            System.out.println("循环跑出异常了");


        }finally {
            System.out.println("这是finally");
            System.out.println(result);
        }
        System.out.println("我是test3我运行完了");
        return 0;
    }

}
