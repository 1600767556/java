package Example8.threadsafe2;

public class Test {
    public static void main(String[] args) {

        //new账户对象
        Account act = new Account("atm--001",10000);

        Account act2 = new Account("atm--002",15000);
        //new两个线程
        Thread t1 = new AccountThead(act);
        Thread t2 = new AccountThead(act);
        Thread t3  = new AccountThead(act2);
        Thread t4  = new AccountThead(act2);
        t1.setName("t1");
        t2.setName("t2");
        t3.setName("t3");
        t4.setName("t4");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }



}
