package Example8;

public class ThreadTest10 {
    public static void main(String[] args) {
//这是当前(main)线程的优先级为1
        Thread.currentThread().setPriority(1);
      /*  System.out.println(Thread.MAX_PRIORITY);
        System.out.println(Thread.MIN_PRIORITY);
        System.out.println(Thread.NORM_PRIORITY);

        System.out.println(Thread.currentThread().getName()+"线程的默认优先级"+Thread.currentThread().getPriority());*/





Thread thread = new Thread(new MyRunnable5());
thread.setPriority(10);
thread.setName("t");
thread.start();


        for (int i = 0; i <1000 ; i++) {
            System.out.println(Thread.currentThread().getName()+"--->"+i);
        }

    }
}
class MyRunnable5 implements Runnable{

    @Override
    public void run() {
       // System.out.println(Thread.currentThread().getName()+"线程默认优先级:"+Thread.NORM_PRIORITY);

        for (int i = 0; i <1000 ; i++) {
            System.out.println(Thread.currentThread().getName()+"--->"+i);
        }
    }
}