package Example5;

public class ExceptionTest11 {
    public static void main(String[] args) {
        try {
            System.out.println("aaa");
            //退出jvm虚拟机
            System.exit(0);
        }finally {
            System.out.println("dada");
        }
    }
}
