package Example5;

import org.omg.CORBA.PUBLIC_MEMBER;

public class StackOperactionException extends Exception {
    public StackOperactionException(){

    }
    public StackOperactionException(String s){
        super(s);
    }
}
