package com.weixin.demo.entity.car;

import java.io.Serializable;

public class ShoppingCar implements Serializable {
    private Integer carId;

    /**
    * 商品id
    */
    private Integer productId;

    /**
    * 购买数量
    */
    private Integer carNum;

    private String weChatNum;

    public Integer getCarId() {
        return carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getCarNum() {
        return carNum;
    }

    public void setCarNum(Integer carNum) {
        this.carNum = carNum;
    }

    public String getWeChatNum() {
        return weChatNum;
    }

    public void setWeChatNum(String weChatNum) {
        this.weChatNum = weChatNum;
    }

    public ShoppingCar() {
    }

    public ShoppingCar(Integer carId, Integer productId, Integer carNum, String weChatNum) {
        this.carId = carId;
        this.productId = productId;
        this.carNum = carNum;
        this.weChatNum = weChatNum;
    }

    @Override
    public String toString() {
        return "ShoppingCar{" +
                "carId=" + carId +
                ", productId=" + productId +
                ", carNum=" + carNum +
                ", wechatNum=" + weChatNum +
                '}';
    }
}