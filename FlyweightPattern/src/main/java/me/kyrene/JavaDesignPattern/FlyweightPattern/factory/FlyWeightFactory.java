package me.kyrene.JavaDesignPattern.FlyweightPattern.factory;

import me.kyrene.JavaDesignPattern.FlyweightPattern.flyWeight.FlyWeight;
import me.kyrene.JavaDesignPattern.FlyweightPattern.flyWeight.impl.ConcreateFlyWeight;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by wanglin on 2018/3/18.
 */
public class FlyWeightFactory {

    private static final Logger LOGGER = LoggerFactory.getLogger(FlyWeightFactory.class);

    private static Map<String,FlyWeight> fwMap = new ConcurrentHashMap<String,FlyWeight>();

    public static FlyWeight getFlyWeight(String name){
        if(fwMap.get(name) == null){
            synchronized (fwMap){
                if(fwMap.get(name) == null){
                    LOGGER.info("Instance of name = {} does not exist, creating it");
                    FlyWeight flyWeight = new ConcreateFlyWeight(name);
                    LOGGER.info("Instance of name = {} is create");
                    fwMap.put(name,flyWeight);
                }
            }
        }
        return fwMap.get(name);
    }
}
