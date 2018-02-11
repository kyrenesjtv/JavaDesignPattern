package me.kyrene.JavaDesignPattern.AbstractFactoryPattern.dao.Product.impl;

import me.kyrene.JavaDesignPattern.AbstractFactoryPattern.dao.Product.IProductDao;
import me.kyrene.JavaDesignPattern.AbstractFactoryPattern.entity.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by wanglin on 2018/2/12.
 */
public class SqlserverProductDao implements IProductDao{
    private  static  final Logger LOGGER = LoggerFactory.getLogger(OracleProductDao.class);
    @Override
    public void createProduct(Product product) {
        LOGGER.info("SQLSERVER CREATE PRODUCT ",product);
    }
}
