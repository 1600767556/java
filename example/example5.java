package example;

public class example5 {
    public class Inner {

        // 内部类的方法
        public void show() {
            System.out.println("welcome to imooc!");
        }
    }
    //无参的构造方法:
    public example5(){
        System.out.println("我是第一个");
        m2(10,100);
    }
    //有参的构造方法
    public example5(int a,int b){
        this.a=a;
        this.b=b;
        System.out.println("我啊啊啊");
        System.out.println(a+b);
    }
    //main的主方法:
    public static void main(String[] args) {
//调用无参的构造方法:
        example5 d = new example5();

            //调用m2方法
            d.m2(50,100);
            d.m3();
//调用有参的构造方法,在括号里面赋值
        example5 d2 = new example5(5,100);
//调用m2方法:
d2.m3();
d2.m2(400,10);



        example5 hello = new example5();
        // 创建内部类对象
        example5.Inner i = hello.new Inner();
        // 调用内部类对象的方法
        i.show();
    }
    //定义变量
    int a;
    int b;

   int m2(int c,int d){

    System.out.println("我被调用了"+c+"啊啊"+(c*d));
return c*d;
}
int m3(){
    System.out.println("我是m3没有参数的"+(a*b));
       return (a*b);
}
}
