package Example4;

public class SwitchTest {
    public static void main(String[] args) {
        switch (Season.AUTUMN){
            case AUTUMN:
                System.out.println("秋天");
                break;
            case SPRING:
                System.out.println("春天");
                break;
            case SUMMER:
                System.out.println("夏天");
            case WINTER:
                System.out.println("冬天");
                break;
        }
    }
}
