package Example8;

public class ThreadTest06 {
    public static void main(String[] args) {
Thread myThread4 = new MyThread4();
myThread4.setName("t");
myThread4.start();
        try {
            //Thread.sleep(1000*5);
            myThread4.sleep(1000*5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //5s后输出
        System.out.println("Hello World!");
    }
}
class MyThread4 extends Thread{
    public void run(){
        for (int i = 0; i <100 ; i++) {
            System.out.println(Thread.currentThread().getName()+"---->"+i);
        }
    }
}