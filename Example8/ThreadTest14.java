package Example8;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
/*
实现线程的第三种方式
    实现Callable 接口
 */
public class ThreadTest14 {
    public static void main(String[] args) throws Exception{
        //创建一个”未来任务类“对象
        FutureTask futureTask = new FutureTask(new Callable() {
            @Override
            public Object call() throws Exception {//call方法相当于run()方法
                System.out.println("call method begin!");
                Thread.sleep(1000*10);
                System.out.println("call method end!");
                int a=10;
                int b = 20;
                return a+b;
            }
        });
        //创建线程对象
        Thread t= new Thread(futureTask);
        //启动线程
        t.start();
        //获取返回值
        Object obj = futureTask.get();
        System.out.println("线程执行结果："+obj);
        //main 方法执行到这里必须等待 因为这个线程在main线程中执行
        System.out.println("Hello World!");

    }
}
