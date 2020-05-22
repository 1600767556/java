package Example7;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
/*
反序列化集合
 */
public class ObjectInputStremTest02 {
    public static void main(String[] args) throws Exception{
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("F:\\java IO流文件放置\\users"));
        List<User> userList = (List<User>)ois.readObject();

       // List<User> userList = (List<User>)ois.readObject();
        for (User u: userList
             ) {
            System.out.println(u);
        }
        ois.close();
    }
}
