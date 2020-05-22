package example;

public class example5_1 {
    private String name;
    private int age;
/*
    public example5_1(String name, int age) {
        this.name = name;
        this.age = age;
    }
*/


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void setNames(String [] names){
        this.name=name;
        System.out.println("我执行了"+names);
    }
}
