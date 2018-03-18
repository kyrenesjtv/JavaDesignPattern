package me.kyrene.JavaDesignPattern.FlyweightPattern.flyWeight.impl;

import me.kyrene.JavaDesignPattern.FlyweightPattern.flyWeight.FlyWeight;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by wanglin on 2018/3/18.
 */
public class ConcreateFlyWeight implements FlyWeight{

    private static final Logger LOGGER = LoggerFactory.getLogger(ConcreateFlyWeight.class);

    private String name;

    public ConcreateFlyWeight(String name){
        this.name=name;
    }

    @Override
    public void action(String str) {
        LOGGER.info("name = {}, str = {}"+name+"--"+str);
    }
}
