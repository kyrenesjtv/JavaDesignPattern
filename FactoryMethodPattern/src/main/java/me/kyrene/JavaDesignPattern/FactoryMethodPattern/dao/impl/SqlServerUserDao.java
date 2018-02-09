package me.kyrene.JavaDesignPattern.FactoryMethodPattern.dao.impl;

import me.kyrene.JavaDesignPattern.FactoryMethodPattern.dao.IUserDao;
import me.kyrene.JavaDesignPattern.FactoryMethodPattern.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by wanglin on 2018/2/9.
 */
public class SqlServerUserDao implements IUserDao {
    private static final Logger LOG = LoggerFactory.getLogger(SqlServerUserDao.class);
    @Override
    public void createUser(User user) {
        LOG.info("Create User from sqlserver",user);
    }
}
