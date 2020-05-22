package Example3;

import java.util.Arrays;

public class ArraysTest02 {
    public static void main(String[] args) {
        int [] arr = {1,50,40,45,64,484,3,24};
        Arrays.sort(arr);
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");

        }
        int index = Arrays.binarySearch(arr,50);
        System.out.println(index==-1?"改元素不存在":"该元素的下标是："+index);
    }
}
