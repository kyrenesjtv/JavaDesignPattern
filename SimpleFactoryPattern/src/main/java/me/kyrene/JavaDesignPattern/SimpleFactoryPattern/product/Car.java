package me.kyrene.JavaDesignPattern.SimpleFactoryPattern.product;

/**
 * Created by wanglin on 2018/2/7.
 */
public abstract class Car {

    protected  String name ;

    public abstract void driver();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
