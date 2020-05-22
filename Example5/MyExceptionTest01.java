package Example5;

import org.omg.CORBA.PUBLIC_MEMBER;

public class MyExceptionTest01 extends Exception {//编译时异常
    public MyExceptionTest01(){

    }
    public MyExceptionTest01(String s){
super(s);
    }




}
/*public class MyExceptionTest01 extends RuntimeException{//运行时异常

}*/

