package MyTest;
/*
合并数组
 */
public class Test08 {
    public static void main(String[] args) {
      hebingshuzu();
    }
    public static void hebingshuzu(){
        int [] arr = new int[5];
        int [] arr2 = new int[5];
        System.out.println("合并前的arr数组");
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = (int) (Math.random()*100);

            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("合并前的arr2数组");
        for (int i = 0; i <arr2.length ; i++) {
            arr2[i] = (int) (Math.random()*100);

            System.out.print(arr2[i]+" ");
        }
        System.out.println();
      int [] arr3 = new int[arr.length+arr2.length];
      System.arraycopy(arr,0,arr3,0,arr.length);
      System.arraycopy(arr2,0,arr3,arr.length,arr2.length);
        System.out.println("数组arr3");
        for (int i = 0; i <arr3.length; i++) {
            System.out.print(arr3[i]+" ");
        }

    }
}
