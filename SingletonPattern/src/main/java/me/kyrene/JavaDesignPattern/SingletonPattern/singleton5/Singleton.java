package me.kyrene.JavaDesignPattern.SingletonPattern.singleton5;

/**
 * Created by wanglin on 2018/3/11.
 */
public class Singleton {

    private static final Singleton SINGLETON = new Singleton();

    private Singleton(){

    }
    //静态饿汉
    public static Singleton getInstance(){
        return SINGLETON;
    }
}
