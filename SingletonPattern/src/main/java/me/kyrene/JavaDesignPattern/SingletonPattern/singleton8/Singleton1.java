package me.kyrene.JavaDesignPattern.SingletonPattern.singleton8;

/**
 * Created by wanglin on 2018/3/11.
 */
public class Singleton1 {

    public static Singleton1 getInstance(){
        return Instance.SINGLETON1.getInstance();
    }
}
