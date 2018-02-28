package me.kyrene.JavaDesignPattern.StrategyPattern.context;

import me.kyrene.JavaDesignPattern.StrategyPattern.strategy.Strategy;

/**
 * Created by wanglin on 2018/2/28.
 */
public class SimpleContext {

    private Strategy strategy;

    public  SimpleContext(Strategy strategy){
        this.strategy=strategy;
    }

    public void action(String input){
        strategy.strategy(input);
    }

}
