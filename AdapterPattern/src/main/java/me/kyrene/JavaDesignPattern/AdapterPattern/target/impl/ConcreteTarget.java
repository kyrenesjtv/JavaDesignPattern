package me.kyrene.JavaDesignPattern.AdapterPattern.target.impl;

import me.kyrene.JavaDesignPattern.AdapterPattern.target.ITarget;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by wanglin on 2018/3/6.
 */
public class ConcreteTarget implements ITarget {

    private static Logger LOGGER = LoggerFactory.getLogger(ConcreteTarget.class);

    @Override
    public void request() {
        LOGGER.info("ConcreteTarget.request()");
    }

}
