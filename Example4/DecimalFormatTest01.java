package Example4;

import java.text.DecimalFormat;

public class DecimalFormatTest01 {
    public static void main(String[] args) {
        DecimalFormat decimalFormat = new DecimalFormat("###,###.###");
        String string = decimalFormat.format(1231.4567);
        System.out.println(string);
        DecimalFormat decimalFormat1 = new DecimalFormat("###,###.000");
        String string2 = decimalFormat1.format(13.22);
        System.out.println(string2);
    }
}
