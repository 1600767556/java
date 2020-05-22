package Example4;

import sun.security.krb5.internal.crypto.RsaMd5CksumType;

public class EnumTest02 {
    //枚举是一种引用数据类型
    public static void main(String[] args) {
Result  result = divide(10,2);
        System.out.println(result==Result.SUCCESS?"执行成功":"执行失败");
    }
    public  static Result divide(int a,int b){
        try {
                int c = a/b;
                return Result.SUCCESS;
        }catch (Exception e){
            return Result.FAIL;
        }

    }
}
//枚举
enum Result{
    SUCCESS,FAIL
}