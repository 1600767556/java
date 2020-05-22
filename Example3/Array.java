package Example3;

public class Array {
    public static void main(String[] args) {
        if (args.length!=2){
            System.out.println("请输入用户名和密码");
        }
        String [] str1 ={};
        int [] nums = {100,500,44,347,};
        int [] nums2 = new int[5];
        System.out.println(nums[0]);
        for (int i = 0; i <nums.length ; i++) {
            System.out.println(nums[i]);
            //倒叙输出

        }
        for (int j = nums.length-1; j >=0 ; j--) {
            System.out.println("倒叙输出-->"+nums[j]);
        }

doSome(nums);
        doSome(str1);
        doSome(nums2);
        System.out.println("+++++++++++");
        System.out.println(args.length);
    }

    public static void doSome(int [] num){
        for (int i = 0; i <num.length ; i++) {
            System.out.println(num[i]);

        }
        System.out.println(num);
    }
public static void doSome(String [] str){
    System.out.println(str);
}
}
