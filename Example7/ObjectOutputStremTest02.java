package Example7;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ObjectOutputStremTest02 {
    public static void main(String[] args) throws Exception{
        List<User> list = new ArrayList<>();
        list.add(new User(100,"zhangsan"));
        list.add(new User(120,"lisi"));
        list.add(new User(130,"huxinliang"));
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("F:\\java IO流文件放置\\users"));

        oos.writeObject(list);
        oos.flush();
        oos.close();
    }
}
