package Example3;

public class ArrayUtil {
    public static void main(String[] args) {
int [] arr ={5,10,45,87,220,440,555};
int index = binarySearch(arr,440);
        System.out.println(index == -1?"该元素不存在":"你要查找的元素的下标是:"+index);
    }
    public static int binarySearch(int [] arr,int dest){
        int begin = 0;
        int end = arr.length-1;
        while (begin<=end){
            int middle = (begin+end)/2;
            if (arr[middle]==dest){
                return middle;
            }else if (arr[middle]<dest){
                begin=middle+1;
            }else {
                end=middle-1;
            }
        }


        return -1;
    }
}
