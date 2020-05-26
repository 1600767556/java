package Example4;

public class EnumTest01 {
    public static void main(String[] args) {
boolean boolean1 = divide(10,1);
        System.out.println(boolean1 ?"执行成功":"执行失败");
    }
    public static boolean divide(int a,int b ){
        try {
            int c = a/b;
            return true;
        }catch (Exception e){
            return false;
        }

    }
}
