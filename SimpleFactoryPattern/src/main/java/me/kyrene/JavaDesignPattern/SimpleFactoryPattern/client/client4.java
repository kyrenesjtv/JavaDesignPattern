package me.kyrene.JavaDesignPattern.SimpleFactoryPattern.client;

import me.kyrene.JavaDesignPattern.SimpleFactoryPattern.factory.CarFacrory2;
import me.kyrene.JavaDesignPattern.SimpleFactoryPattern.product.Car;

/**
 * Created by wanglin on 2018/2/7.
 */
public class client4 {
    public static void main(String[] args) {
        Car car = CarFacrory2.getCar();
        car.driver();
    }
}
