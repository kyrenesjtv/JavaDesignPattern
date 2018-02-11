package me.kyrene.JavaDesignPattern.AbstractFactoryPattern.client;

import me.kyrene.JavaDesignPattern.AbstractFactoryPattern.dao.Product.IProductDao;
import me.kyrene.JavaDesignPattern.AbstractFactoryPattern.dao.Role.IRoleDao;
import me.kyrene.JavaDesignPattern.AbstractFactoryPattern.dao.User.IUserDao;
import me.kyrene.JavaDesignPattern.AbstractFactoryPattern.entity.Product;
import me.kyrene.JavaDesignPattern.AbstractFactoryPattern.entity.Role;
import me.kyrene.JavaDesignPattern.AbstractFactoryPattern.entity.User;
import me.kyrene.JavaDesignPattern.AbstractFactoryPattern.factory.IDaoFactory;
import me.kyrene.JavaDesignPattern.AbstractFactoryPattern.factory.impl.MysqlDaoFactory;

/**
 * Created by wanglin on 2018/2/12.
 */
public class client {
    public static void main(String[] args) {
        IDaoFactory factory = new MysqlDaoFactory();

        IProductDao product = factory.createProduct();
        Product product1 = new Product();
        product1.setProductname("shupian");
        product1.setProductprice(99.9);
        product.createProduct(product1);

        IRoleDao role = factory.createRole();
        Role role1 = new Role();
        role1.setRolename("admin");
        role1.setPermissions(new String[]{"create","update","delete"});
        role.createRole(role1);

        IUserDao user = factory.createUser();
        User user1 = new User();
        user1.setUsername("mo");
        user1.setPassword("xxxx");
        user1.setAge(11);
        user1.setId(22L);
        user.createUser(user1);
    }

}
