package me.kyrene.JavaDesignPattern.BridgePattern.client;

import me.kyrene.JavaDesignPattern.BridgePattern.brand.AbstractCar;
import me.kyrene.JavaDesignPattern.BridgePattern.brand.impl.AudiCar;
import me.kyrene.JavaDesignPattern.BridgePattern.brand.impl.BMWCar;
import me.kyrene.JavaDesignPattern.BridgePattern.transmission.Transmission;
import me.kyrene.JavaDesignPattern.BridgePattern.transmission.impl.Auto;
import me.kyrene.JavaDesignPattern.BridgePattern.transmission.impl.Manual;

/**
 * Created by wanglin on 2018/3/12.
 */
public class BridgeClient {

    public static void main(String[] args) {
        Transmission auto = new Auto();
        AbstractCar bmwCar = new BMWCar();
        bmwCar.setTransmission(auto);
        bmwCar.run();


        Transmission manual = new Manual();
        AbstractCar audiCar = new AudiCar();
        audiCar.setTransmission(manual);
        audiCar.run();
    }
}
