package me.kyrene.JavaDesignPattern.FactoryMethodPattern.factory;

import me.kyrene.JavaDesignPattern.FactoryMethodPattern.dao.IUserDao;

/**
 * Created by wanglin on 2018/2/9.
 */
public interface IDaoFactory {

    public IUserDao  createUser();
}
