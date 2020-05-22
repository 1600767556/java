package Example8;

import java.util.ArrayList;
import java.util.List;

/*
使用wait和notify方法实现"生产者和消费者模式"
 */
public class ThreadTest15 {
    public static void main(String[] args) {
        //创建一个仓库对象
        List list = new ArrayList();
        //生产者线程
        Thread t1 = new Thread(new Producer(list));

        //消费者线程
        Thread t2 = new Thread(new Consumer(list));

        t1.setName("生产者线程");
        t2.setName("消费者线程");
        t1.start();
        t2.start();
    }
}
//生产线程
class Producer implements Runnable{
private List list;

    public Producer(List list) {
        this.list = list;
    }

    @Override
    public void run() {
//一直生产
        while (true){
            synchronized (list){
                if (list.size()>0){
                    try {
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                Object obj =  new Object();
                list.add(obj);
                System.out.println(Thread.currentThread().getName()+"---->"+obj);
                list.notify();
            }

        }
    }
}
//消费线程
class Consumer implements Runnable{
private List list;

    public Consumer(List list) {
        this.list = list;
    }

    @Override
    public void run() {
//一直消费
        while (true){
            synchronized (list){
                if (list.size()==0){
                    try {
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                Object obj = list.remove(0);
                System.out.println(Thread.currentThread().getName()+"---->"+obj);
                list.notify();
            }
        }
    }
}