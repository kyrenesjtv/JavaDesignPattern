package me.kyrene.JavaDesignPattern.SingletonPattern.singleton7;

/**
 * Created by wanglin on 2018/3/11.
 */
public class Singleton {

    private Singleton(){

    }

    public static Singleton getInstance(){
        return InnerClass.SINGLETON;
    }

    private static class InnerClass{
        private static final Singleton SINGLETON = new Singleton();
    }

}
