package Example8;

public class ThreadTest05 {
    public static void main(String[] args) {
       /* try {
            Thread.sleep(1000*5);
            System.out.println("Hello World!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

        for (int i = 0; i <10 ; i++) {
            System.out.println(Thread.currentThread().getName()+"---->"+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
