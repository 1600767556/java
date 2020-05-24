package Example10;

public @interface MyAnnotation04 {
    //属性的类型可以是 byte short int float double boolean char String class 枚举类型
    int value();

    String value2();

    String [] value3();

    Season02 value4();

    Season02 [] value5();

    Class parapeterType();

    Class [] parameterTypes();



}
