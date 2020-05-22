package example;

public class Example6 {
    static  class Person {
        private String name;
public Person(){

}
        public Person(String name,String name1){
            System.out.println("我怎么没出书");
            System.out.println(name+name1);
        }


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
        public void setName(String lastName,String firstNmae)
        {
            this.name=lastName+""+firstNmae;
        }
    }

    public static void main(String[] args) {
        Person ming = new Person();
        Person hong = new Person("hu","xin");

        ming.setName("Xiao Ming");
        // TODO: 给Person增加重载方法setName(String, String):
        hong.setName("Xiao", "Hong");
        System.out.println(ming.getName());
        System.out.println(hong.getName());
    }
}
