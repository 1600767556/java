package Example5;

/*
final finally finalize 区别
*/
public class ExceptionTest13 {
    public static void main(String[] args) {
        //final 是一个关键字 表示最终的,不变的
        final int i = 100;
//finally 也是一个关键字, 和try联合使用,使用在异常的处理机制中
        try{

        }finally {

        }
        //finalize() 是一个Object中的一个方法.作为方法名出现
        //所以finalize 是标识符
        Object object;
    }
}
