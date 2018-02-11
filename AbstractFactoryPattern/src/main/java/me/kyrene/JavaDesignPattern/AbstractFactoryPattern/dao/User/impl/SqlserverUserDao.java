package me.kyrene.JavaDesignPattern.AbstractFactoryPattern.dao.User.impl;

import me.kyrene.JavaDesignPattern.AbstractFactoryPattern.dao.User.IUserDao;
import me.kyrene.JavaDesignPattern.AbstractFactoryPattern.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by wanglin on 2018/2/12.
 */
public class SqlserverUserDao implements IUserDao {
    private  static  final Logger LOGGER = LoggerFactory.getLogger(SqlserverUserDao.class);
    @Override
    public void createUser(User user) {
        LOGGER.info("SQLSERVER CREATE PRODUCT ",user);
    }
}
