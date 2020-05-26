package Example3;

public class StringTest02 {
    public static void main(String[] args) {
        char c = "中过人".charAt(1);
        System.out.println(c);
        int result = "abc".compareTo("abc");
        System.out.println(result);
        System.out.println("Hollo World.java".contains(".java"));
        System.out.println("Hello World.java".endsWith(".java"));
        System.out.println("ABCDef".equalsIgnoreCase("abcdef"));
        System.out.println("dasagagaacavavajavadaodako".indexOf("java"));
        String s = "dada ";
        System.out.println(s.isEmpty());
        byte [] bytes = "abcdef".getBytes();
        for (int i = 0; i <bytes.length ; i++) {
            System.out.print(bytes[i]+" ");
        }
        System.out.println("-----------");
        System.out.println("javaasdafagagagagajava".lastIndexOf("java"));
        System.out.println("------------");
        String newString = "http://www.baidu.com".replace("http://","https://");
        System.out.println(newString);
        String [] ymd = "2000-11-23".split("-");
        for (int i = 0; i <ymd.length ; i++) {
            System.out.println(ymd[i]);
        }
        System.out.println("www.baidu.com".startsWith("www"));
        System.out.println("www.baidu.com".substring(4));
        System.out.println("www.baidu.com".substring(4,6));
        char [] chars = "我是中国人".toCharArray();
        for (int i = 0; i <chars.length ; i++) {
            System.out.println(chars[i]);
        }
        System.out.println("ABGJAcafhuADABGbbJFABjb".toLowerCase());
        System.out.println("ABGJAcafhuADABGbbJFABjb".toUpperCase());
        System.out.println("  adaadad  ".trim());
        String s1 = String.valueOf(true);
        System.out.println(s1);
        String  s2 = String.valueOf( new Customer2());
        System.out.println(s2);
        Object object = new Object();
        System.out.println(object);
    }


}
class Customer2{
    @Override
    public String toString() {
        return "Customer2{}";
    }
}
