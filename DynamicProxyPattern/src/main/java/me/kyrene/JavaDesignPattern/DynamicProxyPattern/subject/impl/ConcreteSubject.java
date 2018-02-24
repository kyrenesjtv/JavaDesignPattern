package me.kyrene.JavaDesignPattern.DynamicProxyPattern.subject.impl;

import me.kyrene.JavaDesignPattern.DynamicProxyPattern.subject.ISubject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by wanglin on 2018/2/23.
 */
public class ConcreteSubject implements ISubject{
    private static final Logger LOGGER = LoggerFactory.getLogger(ConcreteSubject.class);
    @Override
    public void action() {
       // LOGGER.info("ConcreteSubject action()");
    }
}
