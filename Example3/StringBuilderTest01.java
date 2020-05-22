package Example3;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        //StringBuffer 是线程安全的
        //Stringbuilder是非线程安全的
       StringBuilderTest01 stringBuilder = new StringBuilderTest01();
       stringBuilder.append(100);
    }

    private void append(int i) {
    }


}
