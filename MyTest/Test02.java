package MyTest;

public class Test02 {
    public static void main(String[] args) {
        int resoult = 100;
        for (int i = 10; i >0 ; i--) {
            resoult+=resoult/i;

        }
        System.out.println(resoult);

    }
}
