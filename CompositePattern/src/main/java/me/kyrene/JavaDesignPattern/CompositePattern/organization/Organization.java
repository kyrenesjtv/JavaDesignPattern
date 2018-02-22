package me.kyrene.JavaDesignPattern.CompositePattern.organization;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wanglin on 2018/2/22.
 */
public abstract class Organization {

    private List<Organization> organizations = new ArrayList<>();

    private String name ;

    public Organization(String name){
        this.name=name;
    }

    public String getName(){
        return this.name;
    }

    public void addOrganization(Organization orag){
        organizations.add(orag);
    }

    public void removeOrganization(Organization orag){
        organizations.remove(orag);
    }

    public List<Organization> getAllOrganizations(){
        return organizations;
    }

    public abstract void inForm(String info);

    //重写hashCode 和 equals 这样子删除对象的时候就可以正确删除
    @Override
    public int hashCode() {
        return this.name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Organization)) {
            return false;
        }
        return this.name.equals(((Organization) obj).name);
    }
}
