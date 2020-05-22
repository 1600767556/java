package Example8.threadsafe;

public class AccountThead extends Thread{
    private Account act;

    public AccountThead(Account act) {
        this.act = act;
    }

    public void run(){
//run方法执行表示取款操作
        double money = 5000;
        act.withdraw(money);
        System.out.println(Thread.currentThread().getName()+"账户"+act.getActno()+"取款成功,余额"+act.getBalance());
    }
}
