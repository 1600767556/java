package Example5;

public class ExceptionTest10 {
    public static void main(String[] args) {
        try {
            System.out.println("aaa");
            return;
        }finally {
            System.out.println("dad");
        }
       // System.out.println("dada");
    }

}
