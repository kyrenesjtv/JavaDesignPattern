package me.kyrene.JavaDesignPattern.SingletonPattern.singleton2;

/**
 * Created by wanglin on 2018/3/11.
 */
public class Singleton {


    private static Singleton singleton ;

    private Singleton(){

    }
    //同步方法的懒汉
    public static synchronized Singleton getInstance(){
        if(singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }
}
