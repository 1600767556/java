package Example6;

public class foreachTest01 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,6,7,9};
        //缺点 没有下标
        for (int data: arr
             ) {
            System.out.println(data);
        }
    }
}
