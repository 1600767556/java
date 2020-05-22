package Example7;

import java.io.*;

public class CopyAll {
    public static void main(String[] args) {
        File srcFile = new File("F:\\java IO流文件放置");
        File destFile = new File("F:\\a");
        copyDir(srcFile,destFile);
    }

    /**
     * 拷贝目录
     * @param srcFile 拷贝源
     * @param destFile 拷贝目标
     */
    private static void copyDir(File srcFile, File destFile) {
        if (srcFile.isFile()){
            //srcFile 如果是一个文件的话,递归结束
            FileInputStream in = null;
            FileOutputStream out = null;
            try {
                in = new FileInputStream(srcFile);
                String path = destFile.getAbsolutePath().endsWith("\\")?destFile.getAbsolutePath():destFile.getAbsolutePath()+"\\"+srcFile.getAbsolutePath().substring(3);
                out = new FileOutputStream(path);
                byte [] bytes = new byte[1024*1024];
                int readCount = 0;
                while ((readCount = in.read(bytes))!=-1){
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
        //获取源下面的子目录
        File [] files = srcFile.listFiles();
        for (File f:files
             ) {
            //获取所有文件的绝对路径
           // System.out.println(f.getAbsolutePath());

            if (f.isDirectory()){
                //新建对应目录
                //System.out.println(f.getAbsolutePath());
                String srcDir = f.getAbsolutePath();
               // System.out.println(srcDir.substring(3));
                String desDir = (destFile.getAbsolutePath().endsWith("\\") ? destFile.getAbsolutePath():destFile.getAbsolutePath()+"\\")+ srcDir.substring(3);
                //System.out.println(desDir);
               File newFile = new File(desDir);
               if (!newFile.exists()){
                   newFile.mkdirs();
               }
            }
            //递归调用
            copyDir(f,destFile);
        }
    }
}
