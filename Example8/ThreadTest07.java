package Example8;

public class ThreadTest07 {
    public static void main(String[] args) {
Thread thread = new Thread(new MyThread5());
thread.setName("t");
thread.start();
//希望5s之后,t线程醒来
        try {
            Thread.sleep(1000*5);
        } catch (InterruptedException e) {
            e.printStackTrace();

        }
//终端t线程的睡眠(这个方式依靠了java的异常处理机制)
thread.interrupt();
    }
}
class MyThread5 implements Runnable{
//run方法不能throws 只能try catch 因为子类不能有比父类抛出更多的异常
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"----->  begin");
        try {
            Thread.sleep(1000*60*60*24*365);
        } catch (InterruptedException e) {
            //打印异常信息
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"----->  end");
    /*    try {
            doOther();
        } catch (Exception e) {
            e.printStackTrace();
        }*/
    }
//这个方法可以 因为doOther不是继承的方法
//    public void doOther() throws Exception{
//
//    }
}