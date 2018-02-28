package me.kyrene.JavaDesignPattern.StrategyPattern.annotation;


import java.lang.annotation.*;

/**
 * Created by wanglin on 2018/2/28.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface Strategy {
    String name () default "";
}
