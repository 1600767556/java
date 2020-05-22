package Example7;

import java.io.*;

public class CopyAll02 {
    public static void main(String[] args) {
        File srcFile = new File("F:\\数据库代码");
        File destFile = new File("F:\\c");
        copyAll(srcFile,destFile);

    }

    private static void copyAll(File srcFile, File destFile) {
    if (srcFile.isFile()){
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream(srcFile);
            String path = destFile.getAbsolutePath().endsWith("//")?destFile.getAbsolutePath():destFile.getAbsolutePath()+"\\"+srcFile.getAbsolutePath().substring(3);
            out = new FileOutputStream(path);
            byte [] bytes = new byte[1024*1024];
            int readCount = 0;
            while ((readCount = in.read(bytes))!=-1){
               // System.out.println(new String(bytes,0,readCount));
                out.write(bytes,0,readCount);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    return;
}
       /* String s = srcFile.getAbsolutePath();
        System.out.println(s);*/
//获取数据库代码下面的所有子目录
        File [] file = srcFile.listFiles();
        for (File files:file
             ) {
            if (files.isDirectory()){
               // String srcDir  = files.getAbsolutePath();
                //System.out.println(srcDir);
               // String desDir = destFile.getAbsolutePath().endsWith("\\")?destFile.getAbsolutePath():destFile.getAbsolutePath()+"\\"+files.getAbsolutePath().substring(3);
                //System.out.println(desDir);
                File file1 = new File(destFile.getAbsolutePath().endsWith("\\")?destFile.getAbsolutePath():destFile.getAbsolutePath()+"\\"+files.getAbsolutePath().substring(3));
                if (!file1.exists()){
                    file1.mkdirs();
                }

            }

            //递归调用
            copyAll(files,destFile);
        }

    }

}
