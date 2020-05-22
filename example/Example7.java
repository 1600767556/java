package example;

public class Example7 {
    public static void main(String[] args) {
        Example7_2 dog = new Example7_2();
        Example7_2 dog2 = new Example7_2();
if (dog.equals(dog2)){//if(dog==dog2){} 也是不同的
    System.out.println("这两个是相同的(地址)");
}else{
    System.out.println("这两个是不同的");
}
        dog.eat();
        dog.method();
        System.out.println(dog);
    }
}
