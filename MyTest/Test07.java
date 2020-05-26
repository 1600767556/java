package MyTest;
/*
复制数组
 */
public class Test07 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60};
        int[] arr2 = new int[5];
        //第一种
        for (int i = 0; i <arr2.length ; i++) {
            arr2[i]=arr[i];
            System.out.println(arr2[i]);

        }
        System.out.println("-------------");
        //第二种
        System.arraycopy(arr,0,arr2,0,5);
        for (int i = 0; i <arr2.length ; i++) {
            System.out.println(arr2[i]);
        }

    }
}
