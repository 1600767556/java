package Example5;

import com.sun.istack.internal.localization.NullLocalizable;

public class ExceptionTest16 {


}
class Animal{
    public void doSome(){}
    public void doOther() throws Exception{}
}

class Cat extends Animal{
    //编译报错
   /* public void doSome() throws Exception {

    }*/
   //编译正确
/*public void doOther() throws NullPointerException{

}*/
   /* public void doOther() throws Exception{

    }*/
@Override
public void doSome() throws RuntimeException {

}

    
    @Override
    public void doOther()  {

    }
}