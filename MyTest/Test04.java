package MyTest;

import java.util.Scanner;

/*
判断输入的年份是不是闰年
 */
public class Test04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入年份");
        int year = input.nextInt();
if (year%4==0&&year%100!=0){
    System.out.println("是闰年");
}else
    System.out.println("不是闰年");
    }
}
