package me.kyrene.JavaDesignPattern.FactoryMethodPattern.client;

import me.kyrene.JavaDesignPattern.FactoryMethodPattern.dao.IUserDao;
import me.kyrene.JavaDesignPattern.FactoryMethodPattern.entity.User;
import me.kyrene.JavaDesignPattern.FactoryMethodPattern.factory.IDaoFactory;
import me.kyrene.JavaDesignPattern.FactoryMethodPattern.factory.impl.MysqlDaoFactory;
import me.kyrene.JavaDesignPattern.FactoryMethodPattern.factory.impl.OracleDaoFactory;

/**
 * Created by wanglin on 2018/2/9.
 */
public class client {
    public static void main(String[] args) {
        User user = new User();
        user.setId(11L);
        user.setUsername("jian");
        user.setAge(22);
        user.setPassword("mi");
       // IDaoFactory factory = new MysqlDaoFactory();
        IDaoFactory factory = new OracleDaoFactory();
        IUserDao userDao = factory.createUser();
        userDao.createUser(user);
    }
}
