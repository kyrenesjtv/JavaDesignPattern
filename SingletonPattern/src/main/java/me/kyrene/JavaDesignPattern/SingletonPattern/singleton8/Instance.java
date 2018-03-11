package me.kyrene.JavaDesignPattern.SingletonPattern.singleton8;

/**
 * Created by wanglin on 2018/3/11.
 */
public enum Instance {

    SINGLETON1;

    private Singleton1 singleton1;

    private Instance(){
        singleton1 = new Singleton1();
    }

    public  Singleton1 getInstance(){
        return singleton1;
    }

}
