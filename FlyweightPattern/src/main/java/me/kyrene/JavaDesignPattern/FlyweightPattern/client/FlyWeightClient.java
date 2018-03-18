package me.kyrene.JavaDesignPattern.FlyweightPattern.client;

import me.kyrene.JavaDesignPattern.FlyweightPattern.factory.FlyWeightFactory;
import me.kyrene.JavaDesignPattern.FlyweightPattern.flyWeight.FlyWeight;

/**
 * Created by wanglin on 2018/3/18.
 */
public class FlyWeightClient {

    public static void main(String[] args) {
        FlyWeight chun1 = FlyWeightFactory.getFlyWeight("chun1");
        FlyWeight chun2 = FlyWeightFactory.getFlyWeight("chun2");
        FlyWeight chun3 = FlyWeightFactory.getFlyWeight("chun3");

        chun1.action("chun1");
        chun2.action("chun2");
        chun3.action("chun3");
    }
}
