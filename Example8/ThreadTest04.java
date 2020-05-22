package Example8;

public class ThreadTest04 {

    public void doSome(){
        String name = Thread.currentThread().getName();
        System.out.println("-------->"+name);
    }
    public static void main(String[] args) {

ThreadTest04 threadTsest04 = new ThreadTest04();
threadTsest04.doSome();

        Thread ct =  Thread.currentThread();
        System.out.println(ct.getName());


        MyThread2 M = new MyThread2();

        M.setName("m1");
        String s  = M.getName();
        System.out.println(s);

        MyThread2 M2 = new MyThread2();
        M2.setName("m2");
        String s2  = M2.getName();
        System.out.println(s2);

M2.start();
M.start();

    }
}
class MyThread2 extends Thread{
    public void run(){
        for (int i = 0; i <100 ; i++) {
            Thread currentThread = Thread.currentThread();
            System.out.println(currentThread.getName()+" "+i);
        }
    }
}