package MyTest;

import java.util.Scanner;
/*
BIM值
 */
public class Test03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入你的身高(m):");
        double height = input.nextDouble();
        System.out.println("请输入你的体重(kg):");
        double weight = input.nextDouble();
        double BIM = weight/(height*height);
        System.out.println("当前的BIM值为: "+BIM);
        if (BIM<18.5){
            System.out.println("你的体重过轻哦");
        }else if (BIM<24){
            System.out.println("你的体重在标准范围内哦!");
        }else if (BIM<27){
            System.out.println("你的体重过重");
        }else if (BIM<30){
            System.out.println("轻度肥胖");
        }else if (BIM<35){
            System.out.println("中度肥胖");
        }else if (BIM>=35){
            System.out.println("过度肥胖");
        }
    }
}
