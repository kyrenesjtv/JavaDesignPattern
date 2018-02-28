package me.kyrene.JavaDesignPattern.StrategyPattern.context;

import me.kyrene.JavaDesignPattern.Common.util.PropertyUtil;
import me.kyrene.JavaDesignPattern.StrategyPattern.strategy.Strategy;
import org.reflections.Reflections;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by wanglin on 2018/2/28.
 */
public class SimpleFactoryContext {
    private static final Logger LOGGER = LoggerFactory.getLogger(SimpleFactoryContext.class);
    private static Map<String, Class> allStrategies;
    private Strategy strategy;

    static {
        Reflections reflections = new Reflections("me.kyrene.JavaDesignPattern.StrategyPattern.strategy");
        Set<Class<?>> classes = reflections.getTypesAnnotatedWith(me.kyrene.JavaDesignPattern.StrategyPattern.annotation.Strategy.class);
        allStrategies=new ConcurrentHashMap<String,Class>();
        for (Class<?> object : classes){
            me.kyrene.JavaDesignPattern.StrategyPattern.annotation.Strategy strategy1 = object.getAnnotation(me.kyrene.JavaDesignPattern.StrategyPattern.annotation.Strategy.class);
            allStrategies.put(strategy1.name(),object);
        }
        allStrategies = Collections.unmodifiableMap(allStrategies);
    }

    public SimpleFactoryContext() {
        Properties properties = null;
        String type = null;

        try {
            properties = PropertyUtil.loadProperties("strategy.properties");
            type = properties.getProperty("strategy.concrete");
            LOGGER.info("strategy name is {}", type);
        } catch (IOException e) {
            LOGGER.error("parse properties configuration file failed", e);
        }

        if(allStrategies.containsKey(type)){
            LOGGER.info("Created strategy name is {}", type);
            try {
                strategy = (Strategy) allStrategies.get(type).newInstance();
            } catch (InstantiationException | IllegalAccessException ex) {
                LOGGER.error("Instantiate Strategy failed", ex);
            }
        } else {
            LOGGER.error("Specified Strategy name {} does not exist", type);
        }
    }
    public void action(String input) {
        strategy.strategy(input);
    }
}
