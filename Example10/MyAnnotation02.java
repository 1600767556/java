package Example10;

public @interface MyAnnotation02 {
    /**
     *
     * @return
     */
    String name();
    String color();
    int age() default 25;//属性指定默认值 那后面的可以不写了
}
