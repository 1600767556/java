package Example8;
/*
守护线程
 */
public class ThreadTest13 {
    public static void main(String[] args) {
Thread t = new BakeDataThread();
t.setName("备份数据的线程");

//启动线程之前,将t线程设置为守护线程
        t.setDaemon(true);

t.start();

//主线程是用户线程
        for (int i = 0; i <10 ; i++) {
            System.out.println(Thread.currentThread().getName()+"---->"+i);
            try {
                Thread.sleep(1000*1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class BakeDataThread extends Thread{
    public void run(){
     int i =1;
     while (true) {
         System.out.println(Thread.currentThread().getName() + "--->"+(++i));
         try {
             Thread.sleep(1000*1);
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
     }
    }
}