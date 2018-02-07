package me.kyrene.JavaDesignPattern.SimpleFactoryPattern.product;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by wanglin on 2018/2/7.
 */
public class BMWCar extends Car {

    private static Logger LOG = LoggerFactory.getLogger(BMWCar.class);

    public BMWCar(){
        this.name="BMW";
    }

    @Override
    public void driver() {
        LOG.info("My name is {}. I'm on my way", name);
    }
}
