package Example10;
//自定义异常
public class HasNotPropertyException extends RuntimeException{
    public HasNotPropertyException() {
    }
    public HasNotPropertyException(String s) {
        super(s);
    }
}
