package Example7;

import java.io.File;

public class FileTest03 {
    public static void main(String[] args) {
        File file = new File("F:\\java IO流文件放置");
        File [] file1 = file.listFiles();
        for (File f:file1
             ) {
            System.out.println(f);
            System.out.println(f.getName());

        }

    }
}
