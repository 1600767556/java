package Example10;

public class OtherAnnotation02Test {
    @OtherAnnotation02(age = 15,email = {"1600767556@qq.com","1581202971@qq.com"},seasonArray = Season.AUTUMN)
    public void doSome(){

    }
    //如果数组中有一个元素 大括号可以省略
    @OtherAnnotation02(age = 15,email = "1600767556@qq.com" ,seasonArray = {Season.AUTUMN,Season.SPRING})
    public void doOther(){

    }
}
