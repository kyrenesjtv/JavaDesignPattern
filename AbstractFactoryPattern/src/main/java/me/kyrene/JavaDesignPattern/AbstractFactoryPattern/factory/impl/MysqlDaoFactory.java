package me.kyrene.JavaDesignPattern.AbstractFactoryPattern.factory.impl;

import me.kyrene.JavaDesignPattern.AbstractFactoryPattern.dao.Product.IProductDao;
import me.kyrene.JavaDesignPattern.AbstractFactoryPattern.dao.Product.impl.MysqlProductDao;
import me.kyrene.JavaDesignPattern.AbstractFactoryPattern.dao.Role.IRoleDao;
import me.kyrene.JavaDesignPattern.AbstractFactoryPattern.dao.Role.impl.MysqlRoleDao;
import me.kyrene.JavaDesignPattern.AbstractFactoryPattern.dao.User.IUserDao;
import me.kyrene.JavaDesignPattern.AbstractFactoryPattern.dao.User.impl.MysqlUserDao;
import me.kyrene.JavaDesignPattern.AbstractFactoryPattern.factory.IDaoFactory;

/**
 * Created by wanglin on 2018/2/12.
 */
public class MysqlDaoFactory implements IDaoFactory {
    @Override
    public IProductDao createProduct() {
        return new MysqlProductDao();
    }

    @Override
    public IRoleDao createRole() {
        return new MysqlRoleDao();
    }

    @Override
    public IUserDao createUser() {
        return new MysqlUserDao();
    }
}
