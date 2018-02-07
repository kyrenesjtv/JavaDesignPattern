package me.kyrene.JavaDesignPattern.SimpleFactoryPattern.client;

import me.kyrene.JavaDesignPattern.SimpleFactoryPattern.factory.CarFactory3;
import me.kyrene.JavaDesignPattern.SimpleFactoryPattern.product.Car;

/**
 * Created by wanglin on 2018/2/8.
 */
public class client5 {
    public static void main(String[] args) {
        Car car = CarFactory3.getCar();
        car.driver();
    }
}
