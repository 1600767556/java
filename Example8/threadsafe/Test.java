package Example8.threadsafe;

public class Test {
    public static void main(String[] args) {

        //new账户对象
        Account act = new Account("atm--001",10000);
        //new两个线程
        Thread t1 = new AccountThead(act);
        Thread t2 = new AccountThead(act);

        t1.setName("t1");
        t2.setName("t2");

        t1.start();
        t2.start();
    }



}
