package me.kyrene.JavaDesignPattern.CompositePattern.client;

import me.kyrene.JavaDesignPattern.CompositePattern.organization.Organization;
import me.kyrene.JavaDesignPattern.CompositePattern.organization.impl.Company;
import me.kyrene.JavaDesignPattern.CompositePattern.organization.impl.Department;

/**
 * Created by wanglin on 2018/2/22.
 */
public class Client {
    public static void main(String[] args) {
        Organization shCompany = new Company("shCompany");

        Organization shHR = new Department("shHR");
        shCompany.addOrganization(shHR);

        Organization shAdmin = new Department("shAdmin");
        shCompany.addOrganization(shAdmin);

        Organization shFinance = new Department("shFinance");
        shCompany.addOrganization(shFinance);


        Organization bjCompany = new Company("bjCompany");

        Organization bjHR = new Department("bjHR");
        bjCompany.addOrganization(bjHR);

        Organization bjAdmin = new Department("bjAdmin");
        bjCompany.addOrganization(bjAdmin);

        Organization bjFinance = new Department("bjFinance");
        bjCompany.addOrganization(bjFinance);


        Organization company = new Company("company");
        Organization hr = new Department("hr");
        company.addOrganization(hr);
        Organization admin = new Department("admin");
        company.addOrganization(admin);
        Organization finance = new Department("finance");
        company.addOrganization(finance);

        company.addOrganization(shCompany);
        company.addOrganization(bjCompany);

        company.inForm("Cheers");
    }
}
