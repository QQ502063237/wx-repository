package com.weixin.demo.entity.product;

import java.math.BigDecimal;

public class Product {
    private Integer productId;

    /**
    * 商品名称
    */
    private String productName;

    /**
    * 商品类型
    */
    private String productType;

    /**
    * 商品描述
    */
    private String productDesc;

    /**
    * 商品价格
    */
    private BigDecimal productMoney;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    public BigDecimal getProductMoney() {
        return productMoney;
    }

    public void setProductMoney(BigDecimal productMoney) {
        this.productMoney = productMoney;
    }
}