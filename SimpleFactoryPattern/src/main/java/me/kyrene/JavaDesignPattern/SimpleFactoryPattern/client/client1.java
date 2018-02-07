package me.kyrene.JavaDesignPattern.SimpleFactoryPattern.client;

import me.kyrene.JavaDesignPattern.SimpleFactoryPattern.product.BenzCar;
import me.kyrene.JavaDesignPattern.SimpleFactoryPattern.product.Car;

/**
 * Created by wanglin on 2018/2/7.
 */
public class client1 {
    /**
     * 直接通过new 获取到对象，从而执行代码,多态
     * @param args
     */
    public static void main(String[] args) {
        Car benzCar = new BenzCar();
        benzCar.driver();
    }
}
