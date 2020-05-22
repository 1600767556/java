package example;

public class example5_4 {
    public class Inner {

        // 内部类的方法
        public void show() {
            System.out.println("welcome to imooc!");
        }
    }

    public static void main(String[] args) {

        // 创建外部类对象
        example5_4 hello = new example5_4();
        // 创建内部类对象
        Inner i = hello.new Inner();
        // 调用内部类对象的方法
        i.show();
    }
}
