package Example8;
/*
实现线程的第一种方式
    编写一个类，直接继承java.long.thread,重写run方法
 */
public class ThreadTest01 {
    public static void main(String[] args) {
    //创建线程对象
        MyThread myThread = new MyThread();
        //myThread.run(); 不会启动线程，就一个简单的方法调用
    //启动线程
        //作用 启动一个分支线程，只要开辟了新的栈空间 start（）方法就结束了，线程就启动成功了
        //启动成功的线程会自动掉哟run（）方法。并且run（）方法在分支栈的底部（）压栈和main方法是平级的

        myThread.start();
    //这里的代码运行在主线程中
        for (int i = 0; i <1000 ; i++) {
            System.out.println("主线程--->"+i);
        }
    }
}
class MyThread extends Thread{
    @Override
    public void run() {
        //编写程序 这段程序运行在分支线程（栈）中
        for (int i = 0; i <1000 ; i++) {
            System.out.println("分支线程--->"+i);
        }
    }
}
