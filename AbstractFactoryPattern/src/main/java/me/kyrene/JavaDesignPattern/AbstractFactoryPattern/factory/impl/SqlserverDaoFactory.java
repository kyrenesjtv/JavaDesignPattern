package me.kyrene.JavaDesignPattern.AbstractFactoryPattern.factory.impl;

import me.kyrene.JavaDesignPattern.AbstractFactoryPattern.dao.Product.IProductDao;
import me.kyrene.JavaDesignPattern.AbstractFactoryPattern.dao.Product.impl.SqlserverProductDao;
import me.kyrene.JavaDesignPattern.AbstractFactoryPattern.dao.Role.IRoleDao;
import me.kyrene.JavaDesignPattern.AbstractFactoryPattern.dao.Role.impl.SqlserverRoleDao;
import me.kyrene.JavaDesignPattern.AbstractFactoryPattern.dao.User.IUserDao;
import me.kyrene.JavaDesignPattern.AbstractFactoryPattern.dao.User.impl.SqlserverUserDao;
import me.kyrene.JavaDesignPattern.AbstractFactoryPattern.factory.IDaoFactory;

/**
 * Created by wanglin on 2018/2/12.
 */
public class SqlserverDaoFactory implements IDaoFactory {
    @Override
    public IProductDao createProduct() {
        return new SqlserverProductDao();
    }

    @Override
    public IRoleDao createRole() {
        return new SqlserverRoleDao();
    }

    @Override
    public IUserDao createUser() {
        return new SqlserverUserDao();
    }
}
