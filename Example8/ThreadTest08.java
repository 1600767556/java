package Example8;

import java.util.TreeSet;

public class ThreadTest08 {
    public static void main(String[] args) {
Thread thread = new Thread(new MyRunnable3());
thread.setName("r3");
thread.start();

//模拟5s
        try {
            Thread.sleep(1000*5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //5s之后强行终止线程
        thread.stop();//已过时(不建议使用)

    }
}
class MyRunnable3 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            System.out.println(Thread.currentThread().getName()+"----->"+i);
            try {
                Thread.sleep(1000*1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
