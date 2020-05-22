package Example9;

import java.util.ResourceBundle;

/*
资源绑定器必须在类(src)路径下
 */
public class ResourceBundleTest {
    public static void main(String[] args) {
        //只能绑定xxx.properties文件,这个文件必须在类路径下,文件扩展名必须是properties  后面的扩展名不能写
        ResourceBundle bundle = ResourceBundle.getBundle("Example9/classinfo2");
        //ResourceBundle bundle = ResourceBundle.getBundle("Example9/bean/db");
        String classname = bundle.getString("className");
        System.out.println(classname);
    }
}
