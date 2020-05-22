package Example5.HomeWorke;

public class UserService {

    public void register(String username, String password) throws IlleagalNameException {
        if (null == username || username.length() < 6 || username.length() > 14) {

            throw new IlleagalNameException("用户名不合法!");

        }
        System.out.println("注册成功");


    }
}
