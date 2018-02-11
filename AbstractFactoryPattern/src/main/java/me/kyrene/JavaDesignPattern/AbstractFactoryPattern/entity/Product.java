package me.kyrene.JavaDesignPattern.AbstractFactoryPattern.entity;

/**
 * Created by wanglin on 2018/2/12.
 */
public class Product {
    private String productname;
    private Double productprice;

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public Double getProductprice() {
        return productprice;
    }

    public void setProductprice(Double productprice) {
        this.productprice = productprice;
    }

    @Override
    public String toString() {
        return "Product{" + "productname='" + productname + '\'' + ", productprice=" + productprice + '}';
    }
}
