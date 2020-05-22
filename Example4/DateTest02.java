package Example4;

public class DateTest02 {
    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        System.out.println(time);
        long begin = System.currentTimeMillis();
print();
long end = System.currentTimeMillis();
        System.out.println("耗费:"+(end-begin)+"毫秒");
    }
    public static void print(){
        for (int i = 0; i <1000 ; i++) {
            System.out.println("i = " + i);
        }
    }
}
