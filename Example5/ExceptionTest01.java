package Example5;

public class ExceptionTest01 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        if (b==0){
            System.out.println("除数不能为0");
            return;
        }
        int c = a/b;
        System.out.println(c);
    }
}
