package me.kyrene.JavaDesignPattern.SingletonPattern.singleton6;

/**
 * Created by wanglin on 2018/3/11.
 */
public class Singleton {

    private static Singleton singleton ;

    static {
        singleton = new Singleton();
    }
    //静态代码块饿汉
    public static Singleton getInstance(){
        return singleton;
    }

}
