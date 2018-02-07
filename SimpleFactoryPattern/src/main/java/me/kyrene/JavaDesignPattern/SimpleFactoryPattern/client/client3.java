package me.kyrene.JavaDesignPattern.SimpleFactoryPattern.client;

import me.kyrene.JavaDesignPattern.SimpleFactoryPattern.factory.CarFactory1;
import me.kyrene.JavaDesignPattern.SimpleFactoryPattern.product.Car;

/**
 * Created by wanglin on 2018/2/7.
 */
public class client3 {

    public static void main(String[] args) {
        Car car = CarFactory1.getCar();
        car.driver();
    }
}
