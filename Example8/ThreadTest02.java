package Example8;
/*
实现线程的第二种方式，编写一个实现类java.lang.Runnable接口
 */
public class ThreadTest02 {
    public static void main(String[] args) {
//创建MyRynnable对象
       /* MyRunnable m = new MyRunnable();
        Thread t = new Thread(m);*/
       Thread t = new Thread(new MyRunnable());
        t.start();
        for (int i = 0; i <100 ; i++) {
            System.out.println("主线程--->"+i);
        }
    }
}
//不是一个线程，只是一个可运行的类
class MyRunnable implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i <100 ; i++) {
            System.out.println("分支线程--->"+i);
        }
    }
}
