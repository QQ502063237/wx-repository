package com.weixin.demo.entity.carresult;

import java.io.Serializable;
import java.math.BigDecimal;


//购物车内容封装对象 返回前端
public class CarResult implements Serializable {
    //购物车id
    private int carId;
    //商品类型
    private  String productType;
    //微信号
    private  String weChatNum;
    //购物车商品数量
    private int carNum;
    //商品名字
    private String productName;
    //商品图片地址
    private String productUrl;
    //商品单价
    private BigDecimal money;
    //商品描述
    private String productDesc;

    public CarResult() {
    }

    public CarResult(int carId, String productType, String weChatNum, int carNum, String productName, String productUrl, BigDecimal money, String productDesc) {
        this.carId = carId;
        this.productType = productType;
        this.weChatNum = weChatNum;
        this.carNum = carNum;
        this.productName = productName;
        this.productUrl = productUrl;
        this.money = money;
        this.productDesc = productDesc;
    }

    public int getCarId() {
        return carId;
    }

    public String getProductType() {
        return productType;
    }

    public String getWeChatNum() {
        return weChatNum;
    }

    public int getCarNum() {
        return carNum;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductUrl() {
        return productUrl;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public void setWeChatNum(String weChatNum) {
        this.weChatNum = weChatNum;
    }

    public void setCarNum(int carNum) {
        this.carNum = carNum;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductUrl(String productUrl) {
        this.productUrl = productUrl;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    @Override
    public String toString() {
        return "CarResult{" +
                "carId=" + carId +
                ", productType='" + productType + '\'' +
                ", weChatNum='" + weChatNum + '\'' +
                ", carNum=" + carNum +
                ", productName='" + productName + '\'' +
                ", productUrl='" + productUrl + '\'' +
                ", money=" + money +
                ", productDesc='" + productDesc + '\'' +
                '}';
    }
}
