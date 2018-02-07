package me.kyrene.JavaDesignPattern.SimpleFactoryPattern.annotation;

import java.lang.annotation.*;

/**
 * Created by wanglin on 2018/2/7.
 */

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface Vehicle {
    String type () default "";
}
