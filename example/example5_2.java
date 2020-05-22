package example;

public class example5_2 {
    public static void main(String[] args) {
        example5_1 example = new example5_1();
        example.setAge(12);
        example.setName("胡鑫亮");
        System.out.println(example.getAge()+example.getName());
        //example.setNames("胡鑫亮","邵喜明","少司命","焰灵姬");
        example.setNames(new String[] {"Xiao Ming", "Xiao Hong", "Xiao Jun"}); // 传入1个String[]
    }

}
