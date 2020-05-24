package Example10;

public class MyAnnotation02Test {
    //报错原因:如果一个注解中有属性,那么必须给属性赋值
   /* @MyAnnotation02
    public void doSome(){

    }*/

   //指定name属性的值
   @MyAnnotation02(name="shaoshao",color = "blue")
   public void doSome(){

   }
}
