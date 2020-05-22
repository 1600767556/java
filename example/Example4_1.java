package example;

public class Example4_1 {
    public static void main(String[] args) {
        example4 test1 = new example4();
        example4 test2 = new example4("胡",1.2f,5.22f);

    test1.name="苹果";
    test1.cpu=1.41f;
    test1.neicun=64.10f;
    test1.faDuanXin();
    test1.iphone();
    test2.faDuanXin();
    test2.iphone();
    }

}
