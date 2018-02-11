package me.kyrene.JavaDesignPattern.AbstractFactoryPattern.factory;

import me.kyrene.JavaDesignPattern.AbstractFactoryPattern.dao.Product.IProductDao;
import me.kyrene.JavaDesignPattern.AbstractFactoryPattern.dao.Role.IRoleDao;
import me.kyrene.JavaDesignPattern.AbstractFactoryPattern.dao.User.IUserDao;

/**
 * Created by wanglin on 2018/2/12.
 */
public interface IDaoFactory {
    public IProductDao createProduct();
    public IRoleDao createRole();
    public IUserDao createUser();
}
