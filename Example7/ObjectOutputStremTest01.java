package Example7;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
/*
student对象不支持序列化 必须实现Serializable接口方可-
 */
public class ObjectOutputStremTest01 {
    public static void main(String[] args) throws Exception{
Student s = new Student(100,"hu");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("F:\\java IO流文件放置\\students"));
        //序列化对象
        oos.writeObject(s);
        oos.flush();
        oos.close();
    }
}
