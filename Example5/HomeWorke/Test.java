package Example5.HomeWorke;

public class Test {
    public static void main(String[] args) {
        UserService userService = new UserService();
        try {
            userService.register("hu","31231");
        } catch (IlleagalNameException e) {
            System.out.println(e.getMessage());
            //e.printStackTrace();
        }
    }
}
