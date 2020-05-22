package Example3;

public class ArraySearch {
    public static void main(String[] args) {
        int [] arr = {1,5,18,23,86};
        int index =  arraySearch(arr,15);
        System.out.println(index == -1? "钙元素不存在":"钙元素的下表是:"+index);
    }

    public static int arraySearch(int[] arr, int i) {
        for (int j = 0; j <arr.length ; j++) {
            if (i == arr[j])
                return j;
        }
        return -1;
    }

}
