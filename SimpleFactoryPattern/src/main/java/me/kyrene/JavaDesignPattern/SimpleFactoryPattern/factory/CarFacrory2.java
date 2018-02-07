package me.kyrene.JavaDesignPattern.SimpleFactoryPattern.factory;

import me.kyrene.JavaDesignPattern.Common.util.PropertyUtil;
import me.kyrene.JavaDesignPattern.SimpleFactoryPattern.product.Car;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.Properties;

/**
 * Created by wanglin on 2018/2/7.
 */
public class CarFacrory2 {

    private static final Logger LOG = LoggerFactory.getLogger(CarFacrory2.class);

    public static Car getCar() {
        Car car = null;
        String name = null;
        Properties properties = null;
        try {
            properties = PropertyUtil.loadProperties("car.properties");
            name = properties.getProperty("cars.class");//获取car种类的对象
        } catch (IOException e) {
            LOG.error("parse properties configuration file failed", e);
        }

        try {
            car = (Car) Class.forName(name).newInstance();
            LOG.info("Created car class name is {}", name);
        } catch (InstantiationException e) {
            LOG.error("InstantiationException car failed", e);
        } catch (IllegalAccessException e) {
            LOG.error("IllegalAccessException car failed", e);
        } catch (ClassNotFoundException e) {
            LOG.error("ClassNotFoundException car failed", e);
        }

        return car;
    }

}
