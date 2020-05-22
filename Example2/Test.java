package Example2;

public class Test {
    public static void main(String[] args) {
     //int [] nums = {24,8,56,55,44,33,22,11,48,40,80,90,64,32};
     /*
     Find8 f1 = new Find8();
     int [] result = f1.find(nums);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

      */
/*
        for (int i = 0; i <nums.length ; i++) {
            if(nums[i]%8==0){
                System.out.println(nums[i]);
            }
        }

 */
/*
MyMathn m = new MyMathn();
m.isPrime(400);
m.zhisuh(400,500);
*/

/*
*Animal a1 = new Cat();
*Animal a2 = new Bird();
*if(a1 instanceof Cat){
* Cat c1 = (Cat)a1;}
* if(a2 instanceof Bird){
* Bird b1 = (Bird)b1;}
*
*


 */
MyMathn m = new MyMathn();

m.test1(1000);
m.test2(400,500);


        int num=0;
        boolean sign;
        for(int i=2;i<100;i++){
            if(i % 2 == 0 && i != 2  )  continue; //偶数和1排除
            sign=true;
            for (int j=2;j<i;j++){
                if(i%j==0){
                    sign=false;
                    break;
                }
            }
            if (sign){
                num++;
                System.out.println(""+i);
            }
        }
        System.out.println(100+"以内的素数有"+num+"个");

        }

    }


