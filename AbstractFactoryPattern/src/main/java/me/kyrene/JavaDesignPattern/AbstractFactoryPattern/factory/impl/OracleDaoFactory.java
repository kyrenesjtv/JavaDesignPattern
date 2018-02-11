package me.kyrene.JavaDesignPattern.AbstractFactoryPattern.factory.impl;

import me.kyrene.JavaDesignPattern.AbstractFactoryPattern.dao.Product.IProductDao;
import me.kyrene.JavaDesignPattern.AbstractFactoryPattern.dao.Product.impl.OracleProductDao;
import me.kyrene.JavaDesignPattern.AbstractFactoryPattern.dao.Role.IRoleDao;
import me.kyrene.JavaDesignPattern.AbstractFactoryPattern.dao.Role.impl.OracleRoleDao;
import me.kyrene.JavaDesignPattern.AbstractFactoryPattern.dao.User.IUserDao;
import me.kyrene.JavaDesignPattern.AbstractFactoryPattern.dao.User.impl.OracleUserDao;
import me.kyrene.JavaDesignPattern.AbstractFactoryPattern.factory.IDaoFactory;

/**
 * Created by wanglin on 2018/2/12.
 */
public class OracleDaoFactory implements IDaoFactory {
    @Override
    public IProductDao createProduct() {
        return new OracleProductDao();
    }

    @Override
    public IRoleDao createRole() {
        return new OracleRoleDao();
    }

    @Override
    public IUserDao createUser() {
        return new OracleUserDao();
    }
}
