package Example10;

public @interface OtherAnnotation02 {
    int age();
    String [] email();

    /**
     * 季节数据
     * @return
     */
    Season [] seasonArray();
}
