package MyTest;

import java.util.Arrays;

/*
二维数组
 */
public class Test09 {
    public static void main(String[] args) {
       /* int[][]a = new int[5][5];//定义一个5X5的二维数组;
        int temp = a[0][0];//暂存值的临时变量;
        int tempX = 0;
        int tempY = 0;
        //随机数填充二维数组;
        for (int i = 0; i < a.length; i ++){
            for (int j = 0; j < a[i].length; j ++){
                a[i][j] = (int)(Math.random() * 100);
                System.out.println("第" + i + "个数组是:"  + a[i][j]);
                //找出二维数组总最大的值;
                if (a[i][j] > temp){
                    temp = a[i][j];
                    tempX = i;
                    tempY = j;
                }
            }
        }
        System.out.println("二维数组中最大的数是:" + temp);
        System.out.println("最大的数的坐标是:" + "[" + tempX + "]" + "[" + tempY + "]");*/
        int a[] = new int[10];

        Arrays.fill(a, 5);

        System.out.println(Arrays.toString(a));

    }

}
