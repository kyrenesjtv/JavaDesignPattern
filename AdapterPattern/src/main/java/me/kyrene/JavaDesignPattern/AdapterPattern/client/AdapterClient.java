package me.kyrene.JavaDesignPattern.AdapterPattern.client;

import me.kyrene.JavaDesignPattern.AdapterPattern.target.ITarget;
import me.kyrene.JavaDesignPattern.AdapterPattern.target.impl.Adapter;
import me.kyrene.JavaDesignPattern.AdapterPattern.target.impl.ConcreteTarget;

/**
 * Created by wanglin on 2018/3/6.
 */
public class AdapterClient {

    public static void main(String[] args) {
        ITarget adapter = new Adapter();
        adapter.request();
        ITarget target = new ConcreteTarget();
        target.request();
    }
}
