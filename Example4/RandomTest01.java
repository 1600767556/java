package Example4;

import java.util.Random;

public class RandomTest01 {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt();
        System.out.println(number);
        int number2 = random.nextInt(100);
        System.out.println(number2);//不包括101

    }
}
