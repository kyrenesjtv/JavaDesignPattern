package me.kyrene.JavaDesignPattern.StrategyPattern.strategy.impl;

import me.kyrene.JavaDesignPattern.StrategyPattern.strategy.Strategy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by wanglin on 2018/2/28.
 */
@me.kyrene.JavaDesignPattern.StrategyPattern.annotation.Strategy(name = "ConcreteStrategyB")
public class ConcreteStrategyB implements Strategy {
    private static final Logger LOGGER = LoggerFactory.getLogger(ConcreteStrategyB.class);
    @Override
    public void strategy(String input) {
        LOGGER.info("Strategy B for input : {}", input);
    }
}
