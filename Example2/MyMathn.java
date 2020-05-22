package Example2;

public class MyMathn {
    //判断是否是质数,是返回true,不是返回false;
    public void test1(int n) {
        long start = System.currentTimeMillis();    //取开始时间
        int num = 0;
        boolean sign;
        for (int i = 2; i < n; i++) {
            if (i % 2 == 0 && i != 2) continue; //偶数和1排除
            sign = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    sign = false;
                    break;
                }
            }
            if (sign) {
                num++;
                /*         System.out.println(""+i);*/
            }
        }
       // System.out.println(n + "以内的素数有" + num + "个");
        long end = System.currentTimeMillis();
        System.out.println("The time cost is " + (end - start));
        System.out.println("");

    }
    public void test2(int m,int n){
        for (int i = m; i <n ; i++) {
           test1(i);
        }
    }
}

