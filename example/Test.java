package example;

public class Test {
    public static void main(String[] args) {
       char c='胡';
       int n =c;
        System.out.println(n);
        //String->char
        String a = "afanihao胡鑫亮啊";
        char c1 = a.charAt(8);
        System.out.println(c1);
        char[] chs = a.toCharArray();
        System.out.println(chs);


        //char->String
        char []  ch = {'胡','鑫','亮','啊'};
        String str = new String(ch,1,3);
        String s = str+='的';
        System.out.println(s);

    }
}
