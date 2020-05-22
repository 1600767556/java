package CollectionReview;

import java.util.Properties;

public class PropertiesTest {
    public static void main(String[] args) {
        Properties pro = new Properties();
        pro.setProperty("username","hua");
        pro.setProperty("PassWord","123");
        String username = pro.getProperty("username");
        String password = pro.getProperty("PassWord");
        System.out.println(username);
        System.out.println(password);
    }
}
