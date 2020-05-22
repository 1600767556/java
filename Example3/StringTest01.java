package Example3;

public class StringTest01 {
    public static void main(String[] args) {
        String s1 = "Hello World";
        System.out.println(s1);
        byte [] b = {97,98,99,100,101,102,103};
        String s2 = new String(b);
        System.out.println(s2);
        String s3 = new String(b,1,5);
        System.out.println(s3);
        char [] c = {'我','是','中','国','人'};
        String s4 = new String(c,2,3);
        System.out.println(s4);
        String s5 = new String("胡鑫亮");
        System.out.println(s5);
    }
}
