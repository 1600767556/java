package Example7;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class DataInputStremTest01 {
    public static void main(String[] args) throws Exception{
        DataInputStream dis = new DataInputStream(new FileInputStream("F:\\java IO流文件放置\\dos2"));

        byte b = dis.readByte();
        short s = dis.readByte();
        int i = dis.readInt();
        long l = dis.readLong();
        float f = dis.readFloat();
        double d = dis.readDouble();
        boolean sex = dis.readBoolean();
        char c = dis.readChar();

        System.out.println(c);
        System.out.println(b);
        System.out.println(s);
        System.out.println(i+1000);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(sex);



        dis.close();
    }
}
