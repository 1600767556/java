package Example2;



public class InterfaceTest {
    public static void main(String[] args) {
        A a = new b();
         int result2 = a.doMath(10,20);
        System.out.println(result2);
        int result3 = a.sub(50,20);
        System.out.println(result3);
        B b = new D();
        C c = new D();
        b.dos();

            C c2 = (C)b;
        c2.dos2();


        M m = new E();
if (m instanceof K){
    K k1 = (K)m;
}
    }
}
//写一个接口\
interface A{
     int age = 0;
    int math = 0;
     int doMath(int a, int b);
    int sub(int a,int b);

}
interface B{
    void dos();
}
interface C{
    void dos2();

}
class  D implements B,C{

    @Override
    public void dos() {

    }

    @Override
    public void dos2() {
        System.out.println("dos2..........");
    }
}

interface M{

}
interface K{

}
class E implements M{

}

class b implements A{

    @Override
    public int doMath(int a, int b) {
        return a+b;
    }

    @Override
    public int sub(int a, int b) {
        return a-b;
    }
}