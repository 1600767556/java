package Example4;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class IntegerTest01 {
    public static void main(String[] args) {
        Integer i;
        Byte b;
    MyInt myInt = new MyInt(100);
    doSome(myInt);

    }
    public static void doSome(Object object){
        System.out.println(object.toString());
    }
}
