package me.kyrene.JavaDesignPattern.AdapterPattern.adaptee;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by wanglin on 2018/3/6.
 */
public class Adaptee {

    private static Logger LOGGER = LoggerFactory.getLogger(Adaptee.class);

    public void onRequest() {
        LOGGER.info("Adaptee.onRequest()");
    }
}
