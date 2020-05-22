package Example2;

import java.util.Objects;

public class ToString1 {
    public static void main(String[] args) {
  Math m1 = new Math(2000,11,23);
  Math m2 = new Math(2000,22,23);
  Math m3 = new Math(2000,22,23);
        System.out.println(m1.equals(m2));
        System.out.println(m2.equals(m3));
        System.out.println(m1==m2);
        System.out.println(m2==m3);
        int a = 1400;
        int b = 1400;
        int c = 1000;
        System.out.println(a==b);
        System.out.println(a==c);

    }


}
class Math{
    private int year;
    private int month;
    private int day;

    public Math() {
    }

    public Math(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "month{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Math month1 = (Math) o;
        return year == month1.year &&
                month == month1.month &&
                day == month1.day;
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, month, day);
    }
}