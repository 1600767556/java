package example;
import java.util.Scanner;

public class example1 {
    public static void main(String[] args) {

        int classNum = 3;
        int stuNum = 4;
        double average=0;
        double sum = 0;
        Scanner input = new Scanner(System.in);
        for (int i = 1; i <=3 ; i++) {
            sum=0;
            System.out.println("请输入第"+i+"个班级的学院成绩:");
            for (int j = 1; j  <=4; j++) {
                System.out.println("请输入第"+j+"个学员的成绩:");
                int score = input.nextInt();
                sum+=score;

            }

            average=sum/stuNum;
            System.out.println("每个学院的平均分是:"+average);
        }






    }



}
