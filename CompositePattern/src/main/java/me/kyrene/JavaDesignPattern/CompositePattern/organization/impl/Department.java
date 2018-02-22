package me.kyrene.JavaDesignPattern.CompositePattern.organization.impl;

import me.kyrene.JavaDesignPattern.CompositePattern.organization.Organization;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * Created by wanglin on 2018/2/22.
 */
public class Department extends Organization {

    private static Logger LOGGER = LoggerFactory.getLogger(Department.class);

    public Department(String name) {
        super(name);
    }

    @Override
    public void inForm(String info) {
        LOGGER.info("info -- name: "+info.toString()+getName().toString());
    }
}
