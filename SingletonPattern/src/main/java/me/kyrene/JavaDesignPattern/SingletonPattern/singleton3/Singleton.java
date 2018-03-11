package me.kyrene.JavaDesignPattern.SingletonPattern.singleton3;

/**
 * Created by wanglin on 2018/3/11.
 */
public class Singleton {

    private static Singleton singleton ;

    private Singleton(){

    }
    //同步代码块下的懒汉
    public static Singleton getInstance(){
        if(singleton == null){
            synchronized (Singleton.class){
                singleton = new Singleton();
            }
        }
        return singleton;
    }

}
