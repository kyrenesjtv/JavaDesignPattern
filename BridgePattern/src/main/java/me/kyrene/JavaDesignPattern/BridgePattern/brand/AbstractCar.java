package me.kyrene.JavaDesignPattern.BridgePattern.brand;

import me.kyrene.JavaDesignPattern.BridgePattern.transmission.Transmission;

/**
 * Created by wanglin on 2018/3/12.
 */
public abstract class AbstractCar {

    protected Transmission transmission;

    public abstract void run();

    public void setTransmission(Transmission transmission){
        this.transmission=transmission;
    }
}
