package me.kyrene.JavaDesignPattern.SingletonPattern.singleton1;

/**
 * Created by wanglin on 2018/3/11.
 */
public class Singleton {

    private static Singleton singleton;

    private Singleton(){

    }
    //线程不安全的懒汉
    public static Singleton getInstance(){
        if(singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }
}
