package example;
//Animal类
public class Example8_1 {
public int age;
public String  name;
public void eat(){
    System.out.println("动物具有吃的能力");
    System.out.println(age);

}
public Example8_1(){
    System.out.println("无参的");
}
public Example8_1(int age,String name){
    System.out.println(age+name);
}
}

