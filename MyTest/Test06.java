package MyTest;
/*
数组翻转
 */
public class Test06 {
    public static void main(String[] args) {
fanzhuan();

    }
    public static void fanzhuan(){
        int [] arr = new int[5];
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = (int) (Math.random()*100);
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for (int i = 0; i <arr.length/2 ; i++) {
            int temp = arr[arr.length-i-1];
            arr[arr.length-i-1] = arr[i];
            arr[i] = temp;

        }
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
