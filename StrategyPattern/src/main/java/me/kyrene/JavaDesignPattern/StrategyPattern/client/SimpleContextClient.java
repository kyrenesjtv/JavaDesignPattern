package me.kyrene.JavaDesignPattern.StrategyPattern.client;

import me.kyrene.JavaDesignPattern.StrategyPattern.context.SimpleContext;
import me.kyrene.JavaDesignPattern.StrategyPattern.strategy.Strategy;
import me.kyrene.JavaDesignPattern.StrategyPattern.strategy.impl.ConcreteStrategyA;

/**
 * Created by wanglin on 2018/2/28.
 */
public class SimpleContextClient {

    public static void main(String[] args) {
        Strategy concreteStrategyA = new ConcreteStrategyA();
        SimpleContext context = new SimpleContext(concreteStrategyA);
        context.action("Hello World");
    }
}
