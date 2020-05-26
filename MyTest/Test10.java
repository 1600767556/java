package MyTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Field;

public class Test10 {
    public static void main(String[] args) {
        File f = new File("G:\\LOL\\英雄联盟\\TCLS\\Client.exe");
        try {
            new FileInputStream(f);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
