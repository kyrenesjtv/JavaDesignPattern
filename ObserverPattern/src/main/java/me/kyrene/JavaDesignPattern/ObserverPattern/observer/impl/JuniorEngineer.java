package me.kyrene.JavaDesignPattern.ObserverPattern.observer.impl;

import me.kyrene.JavaDesignPattern.ObserverPattern.observer.ITalent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by wanglin on 2018/2/17.
 */
public class JuniorEngineer implements ITalent {

    private static final Logger LOGGER = LoggerFactory.getLogger(JuniorEngineer.class);
    @Override
    public void newJob(String job) {
        LOGGER.info("JuniorEngineer get new position {}", job);
    }
}
