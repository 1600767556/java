package Example7;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectInputStremTest01 {
    public static void main(String[] args) throws Exception{
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("F:\\java IO流文件放置\\students"));
Object o = ois.readObject();
        System.out.println(o);
        ois.close();
    }
}
