package me.kyrene.JavaDesignPattern.AdapterPattern.target.impl;

import me.kyrene.JavaDesignPattern.AdapterPattern.adaptee.Adaptee;
import me.kyrene.JavaDesignPattern.AdapterPattern.target.ITarget;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by wanglin on 2018/3/6.
 */
public class Adapter implements ITarget {

    private static Logger LOGGER = LoggerFactory.getLogger(ConcreteTarget.class);
    private Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        LOGGER.info("Adapter.request");
        adaptee.onRequest();
    }
}
