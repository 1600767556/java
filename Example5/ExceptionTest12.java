package Example5;

public class ExceptionTest12 {
    public static void main(String[] args) {
        int result = m();
        System.out.println(result);
    }

    private static int m() {
        int i = 100;
        try {

            return i;
        }finally {
            i++;
        }
    }
}
