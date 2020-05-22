package example;

//默认狗狗类
public class Example7_2 extends Example7_1 {
public  int age = 10;
    @Override

    //方法的重写
     public void eat() {
        super.eat();//动物可以吃东西
        System.out.println("狗狗可以吃骨头！");
    }

    public Example7_2(){

       super();
        System.out.println("Example7_2被执行了");
    }

    public void method(){
        super.eat();

        System.out.println(super.age);
    }
//toString  转换地址
    @Override
    public String toString() {
        return "Example7_2{" +
                "age=" + age +
                '}';
    }
// 查找属性的相同属性
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Example7_2 that = (Example7_2) o;
        return age == that.age;
    }



}
