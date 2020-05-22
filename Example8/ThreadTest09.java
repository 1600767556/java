package Example8;
/*
怎么合理的终止一个线程
 */
public class ThreadTest09 {
    public static void main(String[] args) {
       MyRunnable4 myRunnable4 =  new MyRunnable4();
        Thread thread = new Thread(myRunnable4);
        thread.setName("t");
        thread.start();
        try {
            Thread.sleep(1000*5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        };
        //终止睡眠
        myRunnable4.run=false;
    }
}
class MyRunnable4 implements Runnable{

    boolean run = true;
    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            if (run) {
                System.out.println(Thread.currentThread().getName() + "--->" + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }else {
                //终止线程

                return;
            }
        }
    }
}