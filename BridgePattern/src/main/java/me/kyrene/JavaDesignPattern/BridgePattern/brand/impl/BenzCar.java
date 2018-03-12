package me.kyrene.JavaDesignPattern.BridgePattern.brand.impl;

import me.kyrene.JavaDesignPattern.BridgePattern.brand.AbstractCar;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by wanglin on 2018/3/12.
 */
public class BenzCar extends AbstractCar {

    private static Logger LOGGER = LoggerFactory.getLogger(BenzCar.class);

    @Override
    public void run() {
        LOGGER.info("-------BenzCar is running--------");
        transmission.gear();
    }
}
