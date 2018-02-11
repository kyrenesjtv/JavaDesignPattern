package me.kyrene.JavaDesignPattern.AbstractFactoryPattern.dao.User.impl;

import me.kyrene.JavaDesignPattern.AbstractFactoryPattern.dao.User.IUserDao;
import me.kyrene.JavaDesignPattern.AbstractFactoryPattern.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by wanglin on 2018/2/12.
 */
public class OracleUserDao implements IUserDao {
    private  static  final Logger LOGGER = LoggerFactory.getLogger(OracleUserDao.class);
    @Override
    public void createUser(User user) {
        LOGGER.info("Oracle CREATE PRODUCT ",user);
    }
}
