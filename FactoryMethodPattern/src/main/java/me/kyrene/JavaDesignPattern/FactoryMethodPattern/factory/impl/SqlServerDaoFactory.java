package me.kyrene.JavaDesignPattern.FactoryMethodPattern.factory.impl;

import me.kyrene.JavaDesignPattern.FactoryMethodPattern.dao.IUserDao;
import me.kyrene.JavaDesignPattern.FactoryMethodPattern.dao.impl.SqlServerUserDao;
import me.kyrene.JavaDesignPattern.FactoryMethodPattern.factory.IDaoFactory;

/**
 * Created by wanglin on 2018/2/9.
 */
public class SqlServerDaoFactory implements IDaoFactory {
    @Override
    public IUserDao createUser() {
        return new SqlServerUserDao();
    }
}
