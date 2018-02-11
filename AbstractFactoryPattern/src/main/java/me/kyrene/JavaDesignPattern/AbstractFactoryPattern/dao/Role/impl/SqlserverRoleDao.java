package me.kyrene.JavaDesignPattern.AbstractFactoryPattern.dao.Role.impl;

import me.kyrene.JavaDesignPattern.AbstractFactoryPattern.dao.Role.IRoleDao;
import me.kyrene.JavaDesignPattern.AbstractFactoryPattern.entity.Role;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by wanglin on 2018/2/12.
 */
public class SqlserverRoleDao implements IRoleDao {
    private  static  final Logger LOGGER = LoggerFactory.getLogger(SqlserverRoleDao.class);
    @Override
    public void createRole(Role role) {
        LOGGER.info("SQLSERVER CREATE PRODUCT ",role);
    }
}
