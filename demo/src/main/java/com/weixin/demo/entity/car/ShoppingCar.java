package com.weixin.demo.entity.car;

import com.weixin.demo.entity.product.Product;
import com.weixin.demo.entity.productimg.ProductImg;

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

    /**
     * 微信号
     */
    private String weChatNum;


    /**
     * 商品详情属性
     */
    private Product product;


    /**
     * 商品图片属性
     */
    private ProductImg productImg;


    public Integer getCarId() {
        return carId;
    }

    public Integer getProductId() {
        return productId;
    }

    public Integer getCarNum() {
        return carNum;
    }

    public String getWeChatNum() {
        return weChatNum;
    }

    public Product getProduct() {
        return product;
    }

    public ProductImg getProductImg() {
        return productImg;
    }


    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public void setCarNum(Integer carNum) {
        this.carNum = carNum;
    }

    public void setWeChatNum(String weChatNum) {
        this.weChatNum = weChatNum;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setProductImg(ProductImg productImg) {
        this.productImg = productImg;
    }

    public ShoppingCar() {
    }

    public ShoppingCar(Integer carId, Integer productId, Integer carNum, String weChatNum) {
        this.carId = carId;
        this.productId = productId;
        this.carNum = carNum;
        this.weChatNum = weChatNum;
    }

    public ShoppingCar(Integer carId, Integer productId, Integer carNum, String weChatNum, Product product) {
        this.carId = carId;
        this.productId = productId;
        this.carNum = carNum;
        this.weChatNum = weChatNum;
        this.product = product;
    }

    @Override
    public String toString() {
        return "ShoppingCar{" +
                "carId=" + carId +
                ", productId=" + productId +
                ", carNum=" + carNum +
                ", weChatNum='" + weChatNum + '\'' +
                ", product=" + product +
                ", productImg=" + productImg +
                '}';
    }
}