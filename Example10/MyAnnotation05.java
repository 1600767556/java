package Example10;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//只允许该注解可以标注类,方法
@Target(/*value = */{ElementType.TYPE,ElementType.METHOD,ElementType.FIELD})
//希望这个注解可以被反射
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation05 {
    String value() default "江干区";

}
