package Example7;

import sun.rmi.runtime.Log;

public class LogTest {
    //测试工具类是否好用
    public static void main(String[] args) {
        Logger.log("调用了System类的gc()方法,建议启动垃圾回收");
        Logger.log("这是真的牛逼啊");
        Logger.log("还得好好研究一下!");
    }
}
