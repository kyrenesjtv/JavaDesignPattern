package me.kyrene.JavaDesignPattern.StrategyPattern.client;

import me.kyrene.JavaDesignPattern.StrategyPattern.context.SimpleFactoryContext;

/**
 * Created by wanglin on 2018/2/28.
 */
public class SimpleFactoryContextClient {
    public static void main(String[] args) {
        SimpleFactoryContext context = new SimpleFactoryContext();
        context.action("Hello World");

    }
}
