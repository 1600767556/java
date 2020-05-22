package Example2;

public class Hashcode {
    public static void main(String[] args) {
MyMath m1 =new MyMath();
m1.mySum(new Compute() {
    @Override
    public int sum(int a, int b) {
        return 0;
    }
}, 100, 200);

    }
}

interface Compute{
    int sum(int a,int b);
}
/*class CompultImple implements Compute{

    @Override
    public int sum(int a, int b) {
        return a+b;
    }
}*/
class MyMath{


public void mySum(Compute c,int x, int y){
    int relative = c.sum(x,y);
    System.out.println(x+"+"+y+"="+relative);
}

}
