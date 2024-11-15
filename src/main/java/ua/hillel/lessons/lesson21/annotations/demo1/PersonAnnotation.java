package ua.hillel.lessons.lesson21.annotations.demo1;

import java.lang.annotation.*;

@Inherited
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface PersonAnnotation {
    String name() default "Den";
//    int age() default 11;

//    String value();
}
