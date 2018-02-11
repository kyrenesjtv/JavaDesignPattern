package me.kyrene.JavaDesignPattern.AbstractFactoryPattern.entity;

import java.util.Arrays;

/**
 * Created by wanglin on 2018/2/12.
 */
public class Role {
    private String rolename;
    private String[] permissions;

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    public String[] getPermissions() {
        return permissions;
    }

    public void setPermissions(String[] permissions) {
        this.permissions = permissions;
    }

    @Override
    public String toString() {
        return "Role{" + "rolename='" + rolename + '\'' + ", permissions=" + Arrays.toString(permissions) + '}';
    }
}
