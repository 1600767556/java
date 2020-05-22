package Example7;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class DataOutputStremTest01 {
    public static void main(String[] args) throws Exception{
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("F:\\java IO流文件放置\\dos2"));
        byte b = 100;
        short s = 200;
        int i = 300;
        long l = 400L;
        float f = 3.0f;
        double d = 3.14;
        boolean sex = false;
        char c = 'g';
        dos.writeByte(b);
        dos.writeShort(s);
        dos.writeInt(i);
        dos.writeLong(l);
        dos.writeFloat(f);
        dos.writeDouble(d);
        dos.writeBoolean(sex);
        dos.writeChar(c);

        dos.flush();
        dos.close();
    }
}
