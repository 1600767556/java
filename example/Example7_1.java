package example;
//默认Animals类
public class Example7_1 {


protected int age;
public String name;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



 public void eat(){
    System.out.println("动物都可以吃东西!");
}

public Example7_1(){
    System.out.println("Example7_1被执行了");
    age = 20;
    }
}
