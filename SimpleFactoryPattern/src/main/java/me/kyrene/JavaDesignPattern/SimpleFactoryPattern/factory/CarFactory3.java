package me.kyrene.JavaDesignPattern.SimpleFactoryPattern.factory;

import me.kyrene.JavaDesignPattern.Common.util.PropertyUtil;
import me.kyrene.JavaDesignPattern.SimpleFactoryPattern.annotation.Vehicle;
import me.kyrene.JavaDesignPattern.SimpleFactoryPattern.product.Car;
import org.reflections.Reflections;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.Collections;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;


/**
 * Created by wanglin on 2018/2/7.
 */
public class CarFactory3 {

    private static final Logger LOG = LoggerFactory.getLogger(CarFactory3.class);

    private static Map<String, Class> allCars;

    static {
        Reflections reflections = new Reflections("me.kyrene.JavaDesignPattern.SimpleFactoryPattern.product");
        Set<Class<?>> annotated  = reflections.getTypesAnnotatedWith(Vehicle.class);
        allCars = new ConcurrentHashMap<>();
        for (Class<?> clazz : annotated) {
            Vehicle annotation = clazz.getAnnotation(Vehicle.class);
            allCars.put(annotation.type(),clazz);
        }
        allCars = Collections.unmodifiableMap(allCars);//变成一个只读的map，put的话会报错
    }

    public static Car getCar() {
        Car car = null;
        String type = null;
        Properties properties = null;
        try {
            properties = PropertyUtil.loadProperties("car.properties");
            type = properties.getProperty("cars.annotation");
            LOG.info("car type is {}", type);
        } catch (IOException e) {
            LOG.error("parse properties configuration file failed", e);
        }
        if(allCars.containsKey(type)){
            LOG.info("created car type is {}", type);
            try {
                car= (Car) allCars.get(type).newInstance();
            } catch (InstantiationException e) {
                LOG.error("InstantiationException car failed", e);
            } catch (IllegalAccessException e) {
                LOG.error("IllegalAccessException car failed", e);
            }
        }else {
            LOG.error("specified car type {} does not exist", type);
        }
        return car;
    }
}
