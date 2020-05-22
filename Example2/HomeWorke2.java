package Example2;

public class HomeWorke2 {
    public static void main(String[] args) {
Number n1 = new Number(10,2);
n1.addition();
n1.subtration();
n1.multipilication();
n1.division();
    }
}
class Number{
    private int n1;
    private int n2;

    public Number() {
    }

    public Number(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }


    public void addition(){
//        System.out.println(n1+n2);
        System.out.println(this.getN1()+"+"+this.getN2()+"="+(this.getN1()+this.getN2()));
    }
    public void subtration(){
        System.out.println(n1-n2);
    }
    public void multipilication(){
        System.out.println(n1*n2);
    }
    public void division(){
        System.out.println(n1/n2);
    }

}