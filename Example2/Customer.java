package Example2;

public class Customer {

    String name;
public Customer(){

}
    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public  void shopping(){
        System.out.println(name+"正在购物");

    }

    public static void doSome(){
        //System.out.println(name);报错
        Customer c3 = new Customer();
        c3.setName("焰灵姬");
        System.out.println(c3.name);
    }
    public void doOther(){
        System.out.println("doTher");
    }
    public void doRrun(){
    doOther();
        System.out.println("执行了");


    }

}
