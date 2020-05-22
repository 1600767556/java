package Example3;


import java.util.Arrays;

public class ArraysTest {
    public static void main(String[] args) {
    /*    int [] arr = {1,2,3,45,87,14,26,4,6,7};
    Arrays.sort(arr);
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }*/
    int count=0;
    int [] arr = {1,5,4,23,78,1,45,98,5};
        for (int i = arr.length-1; i >0 ; i--) {
            for (int j = 0; j < i; j++) {
                count++;
                if (arr[j] > arr[j+1]) {
                    int temp;
                    temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("比较次数:"+count);
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
}
