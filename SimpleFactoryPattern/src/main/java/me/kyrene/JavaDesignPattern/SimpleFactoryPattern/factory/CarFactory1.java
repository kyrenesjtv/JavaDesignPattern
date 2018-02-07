package me.kyrene.JavaDesignPattern.SimpleFactoryPattern.factory;

import me.kyrene.JavaDesignPattern.Common.util.PropertyUtil;
import me.kyrene.JavaDesignPattern.SimpleFactoryPattern.client.client2;
import me.kyrene.JavaDesignPattern.SimpleFactoryPattern.product.AudiCar;
import me.kyrene.JavaDesignPattern.SimpleFactoryPattern.product.BMWCar;
import me.kyrene.JavaDesignPattern.SimpleFactoryPattern.product.BenzCar;
import me.kyrene.JavaDesignPattern.SimpleFactoryPattern.product.Car;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.Properties;

/**
 * Created by wanglin on 2018/2/7.
 */
public class CarFactory1 {

    private static final Logger LOG = LoggerFactory.getLogger(CarFactory1.class);

    public static Car getCar() {
        Car car = null;
        String name = null;
        Properties properties = null;
        try {
            properties = PropertyUtil.loadProperties("car.properties");
            name = properties.getProperty("cars.factory1");
        } catch (IOException e) {
            LOG.error("parse properties configuration file failed", e);
        }
        switch (name){
            case "BMW":
                car = new BMWCar();
                break;
            case "Benz":
                car = new BenzCar();
                break;
            case "Audi":
                car = new AudiCar();
                break;
            default:
                car = null;
                break;
        }
        LOG.info("Created car name is {}", name);
        return car;
    }
}
