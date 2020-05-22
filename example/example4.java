package example;

public class example4 {
public example4(){

    System.out.println("无参的构造方法执行了!");
}
public example4(String newName,float newCpu, float newNeicun){


    if (newCpu<3.5f){
        System.out.println("你的输入有误自动变成3.5");
        newCpu= 3.5f;
    }else{
        cpu= newCpu;
    }
    name=newName;
    cpu =newCpu;
    neicun=newNeicun;
    System.out.println("有参数的构造方法");
}


    String name;
    float cpu;
    float neicun;
    int var;
    int localVar = 10;



    void iphone(){
        int localVar = 10;
        System.out.println("我草"+localVar);
        System.out.println("我偶可以打电话!");
        System.out.println(var);
    }



    void faDuanXin(){
        System.out.println(localVar);
        System.out.println("我可以发短信!"+cpu+"a"+name+"aa"+neicun);
        System.out.println(var);
    }



    public static void main(String[] args) {
        example4 test1 = new example4();
        example4 test2 = new example4("胡",1.2f,5.22f);
        test1.name="苹果";
        test1.cpu=1.41f;
        test1.neicun=64.10f;
        test1.faDuanXin();
        test2.faDuanXin();


    }
}
