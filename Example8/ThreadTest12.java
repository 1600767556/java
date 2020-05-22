package Example8;
/*
线程合并
 */
public class ThreadTest12 {
    public static void main(String[] args) {
        System.out.println("main begin!");

        Thread thread = new Thread(new MyRunnable7());
        thread.setName("t");
        thread.start();

        //合并线程
        try {
            thread.join();//thread合并到当前线程 ,当前线程受阻 thread线程知道结束
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("main over!");


    }
}
class MyRunnable7 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i <100 ; i++) {
            System.out.println(Thread.currentThread().getName()+"--->"+i);

        }
    }
}