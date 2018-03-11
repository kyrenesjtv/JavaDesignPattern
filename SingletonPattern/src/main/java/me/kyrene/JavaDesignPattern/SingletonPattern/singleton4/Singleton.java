package me.kyrene.JavaDesignPattern.SingletonPattern.singleton4;

/**
 * Created by wanglin on 2018/3/11.
 */
public class Singleton {

    private static volatile Singleton singleton;

    private Singleton(){

    }
    // 双重检查下的懒汉
    public static Singleton getInstance(){
        if(singleton == null){
            synchronized (Singleton.class){
                if(singleton == null){
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

}
