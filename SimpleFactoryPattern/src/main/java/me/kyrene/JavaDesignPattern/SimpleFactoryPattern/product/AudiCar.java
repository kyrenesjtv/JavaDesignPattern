package me.kyrene.JavaDesignPattern.SimpleFactoryPattern.product;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by wanglin on 2018/2/7.
 */
public class AudiCar extends Car {

    private static Logger LOG = LoggerFactory.getLogger(AudiCar.class);

    public AudiCar(){
        this.name="Audi";
    }

    @Override
    public void driver() {
        LOG.info("My name is {}. I'm on my way", name);
    }
}
