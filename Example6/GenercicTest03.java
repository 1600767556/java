package Example6;

public class GenercicTest03<E> {

    public void doSome(E o){

        System.out.println(o);
    }


    public static void main(String[] args) {
        //GenercicTest03<String> genercicTest03 = new GenercicTest03();
        //genercicTest03.doSome("\033[32;4m" + "123" + "\033[0m") ;
        GenercicTest03<Integer> genercicTest031 = new GenercicTest03<>();
        genercicTest031.doSome(1000);

       /* System.out.println("\033[30;4m" + "123" + "\033[0m");
        System.out.println("\033[31;4m" + "Hello" + "\033[0m");
        System.out.println("\033[32;4m" + "Hello" + "\033[0m");
        System.out.println("\033[33;4m" + "Hello" + "\033[0m");
        System.out.println("\033[34;4m" + "Hello" + "\033[0m");
        System.out.println("\033[35;4m" + "Hello" + "\033[0m");
        System.out.println("\033[36;4m" + "Hello" + "\033[0m");
        System.out.println("\033[37;4m" + "Hello" + "\033[0m");
        System.out.println("\033[40;31;4m" + "Hello" + "\033[0m");
        System.out.println("\033[41;32;4m" + "Hello" + "\033[0m");
        System.out.println("\033[42;33;4m" + "Hello" + "\033[0m");
        System.out.println("\033[43;34;4m" + "Hello" + "\033[0m");
        System.out.println("\033[44;35;4m" + "Hello" + "\033[0m");
        System.out.println("\033[45;36;4m" + "Hello" + "\033[0m");
        System.out.println("\033[46;37;4m" + "Hello" + "\033[0m");*/

        MyIterator<String > myIterator = new MyIterator();
        String s = myIterator.get();

        MyIterator<Animal > myIterator2 = new MyIterator();
        Animal s2 = myIterator2.get();

        GenercicTest03 genercicTest032 = new GenercicTest03();
        genercicTest032.doSome(new Object());
    }



}
class MyIterator<T>{
    public T get(){
        return null;
    }
}
