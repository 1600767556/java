package Example4;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) throws ParseException {
        Date d1 = new Date();
        System.out.println(d1);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
        String s1 = simpleDateFormat.format(d1);
        System.out.println(s1);

        String date = "2008-08-08 08:08:08:08";
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
        Date date1 = simpleDateFormat1.parse(date);
        System.out.println(date1);
    }
}
