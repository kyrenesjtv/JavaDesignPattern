package me.kyrene.JavaDesignPattern.AbstractFactoryPattern.dao.Role.impl;

import me.kyrene.JavaDesignPattern.AbstractFactoryPattern.dao.Role.IRoleDao;
import me.kyrene.JavaDesignPattern.AbstractFactoryPattern.entity.Role;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by wanglin on 2018/2/12.
 */
public class OracleRoleDao implements IRoleDao {
    private  static  final Logger LOGGER = LoggerFactory.getLogger(MysqlRoleDao.class);
    @Override
    public void createRole(Role role) {
        LOGGER.info("ORACLE CREATE PRODUCT ",role);
    }
}
