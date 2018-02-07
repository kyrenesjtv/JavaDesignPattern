package me.kyrene.JavaDesignPattern.SimpleFactoryPattern.client;

import me.kyrene.JavaDesignPattern.Common.util.PropertyUtil;
import me.kyrene.JavaDesignPattern.SimpleFactoryPattern.product.AudiCar;
import me.kyrene.JavaDesignPattern.SimpleFactoryPattern.product.BMWCar;
import me.kyrene.JavaDesignPattern.SimpleFactoryPattern.product.BenzCar;
import me.kyrene.JavaDesignPattern.SimpleFactoryPattern.product.Car;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Properties;

/**
 * Created by wanglin on 2018/2/7.
 */
public class client2 {
    private static final Logger LOG = LoggerFactory.getLogger(client2.class);

    public static void main(String[] args) {
        Properties properties = PropertyUtil.loadProperties("car.properties");
        String name = properties.getProperty("cars.driver2");
        Car car ;
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
        car.driver();
    }
}
