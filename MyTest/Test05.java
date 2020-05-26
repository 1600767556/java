package MyTest;
/*
随机生成0-100的整数判断最小值
 */
public class Test05 {
    public static void main(String[] args) {
min();
    }

    public static void min(){
        int [] arr = new int[5];
        int b = arr[0];
        int target=100;
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = (int) (Math.random()*100);
            System.out.println(arr[i]);
            int value=arr[i];
            if (value<target){
                target=value;
            }
        }

     /*   for (int i = 0; i <arr.length ; i++) {
            int value=arr[i];
            if (value<target){
                target=value;
            }

        }*/
        System.out.println("最小值："+target);

    }
}

