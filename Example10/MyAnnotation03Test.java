package Example10;

public class MyAnnotation03Test {

    @MyAnnotation03(value = "hehe")
    public void doSome(){

    }
    //属性名是value,并且只有一个属性值可以省略
    @MyAnnotation03("hehe")
    public void doOther(){

    }

}
