package Example4;

import java.util.Date;

import java.text.SimpleDateFormat;


public class DateTest03 {
    public static void main(String[] args) {
        Date time = new Date(1);
       SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
        String string = simpleDateFormat.format(time);
        System.out.println(string);

        Date time2 = new Date(System.currentTimeMillis()-1000*60*60*24);
        String string2= simpleDateFormat.format(time2);
        System.out.println(string2);

        Date time3 = new Date(System.currentTimeMillis());
        String string3= simpleDateFormat.format(time3);
        System.out.println(string3);

        long time4 = System.currentTimeMillis();
        System.out.println(time4);

    }
}
