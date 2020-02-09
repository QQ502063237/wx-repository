package com.weixin.demo.entity.product;

import java.math.BigDecimal;
import java.util.Date;

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

    /**
     * 创建时间
     *
     */
    private Date createTime;

    /**
     * 数量
     * @return
     */
    private  Integer productNum;

    /**
     * 状态
     * @return
     */
    private  Integer productStatus;


    public Integer getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductType() {
        return productType;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public BigDecimal getProductMoney() {
        return productMoney;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public Integer getProductNum() {
        return productNum;
    }

    public Integer getProductStatus() {
        return productStatus;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    public void setProductMoney(BigDecimal productMoney) {
        this.productMoney = productMoney;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public void setProductNum(Integer productNum) {
        this.productNum = productNum;
    }

    public void setProductStatus(Integer productStatus) {
        this.productStatus = productStatus;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productType='" + productType + '\'' +
                ", productDesc='" + productDesc + '\'' +
                ", productMoney=" + productMoney +
                ", createTime=" + createTime +
                ", productNum=" + productNum +
                ", productStatus=" + productStatus +
                '}';
    }
}