package Example3;

public class ArrayTwo {
    public static void main(String[] args) {
        int [][] arr = {{1,2,3,4,5,6,7,8,9},{6,7,9,9},{100,2,400,11}};
      /*int [][] arr = {{1,2,3,4,5,6,7,8,9},{6,7,9,9},{100,2,400,11}};
        System.out.println(arr.length);
        System.out.println(arr[0].length);
        System.out.println(arr[2][2]);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println("");
        }*/

      int [][] arr1 = new int[3][4];
      arrMath(arr1);
      arrMath(arr);
      arrMath(new int[][]{{1,2,3,4,5,6,7,8,9},{6,7,9,9},{100,2,400,11}});
    }
    public static void arrMath(int [][] arr){
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
