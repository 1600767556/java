package Example2;

public class Date {
    private int year;
    private int month;
    private int date;

   public Date(int i) {
        
this(2000,1,1);
    }



    public Date(int year, int month, int date) {
        this.year = year;
        this.month = month;
        this.date = date;
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

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public void doSome(){
        System.out.println(year+"年"+month+"月"+date+"日");
    }
}
