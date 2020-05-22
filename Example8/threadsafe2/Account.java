package Example8.threadsafe2;
/*
使用线程同步机制,来解决线程安全问题
 */
public class Account {
    private String actno;
    private double balance;

    public Account() {
    }

    public Account(String actno, double balance) {
        this.actno = actno;
        this.balance = balance;
    }

    public String getActno() {
        return actno;
    }

    public void setActno(String actno) {
        this.actno = actno;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void withdraw(double money){
        //线程同步机制的语法:
        //()里面的数据必须是多线程共享的数据.才能达到多线程排队
        //Object object = new Object(); 不行 ..       "abc" 可以
        synchronized (this){
            double before = this.getBalance();
            double after = before-money;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.setBalance(after);
        }
        }

}
