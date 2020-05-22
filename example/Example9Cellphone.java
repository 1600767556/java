package example;

public class  Example9Cellphone extends Example9Telphone{
    @Override
    public void call() {
        System.out.println("通过键盘发信息");
    }

    @Override
    public void message() {
        System.out.println("通过键盘发短信");
    }
}
