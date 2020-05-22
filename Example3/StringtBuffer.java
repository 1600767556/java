package Example3;

public class StringtBuffer {
    public static void main(String[] args) {
        String s1 = "";
        for (int i = 0; i <10 ; i++) {
            s1+=i;
            System.out.println(s1);
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("a");
        stringBuffer.append(true);
        System.out.println(stringBuffer);
        StringBuffer stringBuffer1 = new StringBuffer(100);

    }
}
