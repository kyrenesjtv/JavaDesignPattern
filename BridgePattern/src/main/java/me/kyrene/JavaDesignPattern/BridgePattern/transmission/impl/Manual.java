package me.kyrene.JavaDesignPattern.BridgePattern.transmission.impl;

import me.kyrene.JavaDesignPattern.BridgePattern.transmission.Transmission;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by wanglin on 2018/3/12.
 */
public class Manual extends Transmission {
    private static Logger LOGGER = LoggerFactory.getLogger(Manual.class);
    @Override
    public void gear() {
        LOGGER.info("-----the car is manual-----");
    }
}
