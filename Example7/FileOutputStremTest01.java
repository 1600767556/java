package Example7;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStremTest01 {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("F:\\java IO流文件放置\\temp.txt",true);
            byte [] bytes = {97,98,99,100,101};
                fos.write(bytes);

            fos.write(bytes,0,2);

            String s = "我是一个中国人,我骄傲!!!";
            byte [] mb = s.getBytes();
            fos.write(mb);
            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
