package com.weixin.demo.entity.orderinfo;

public class OrderInfo {
    private Integer orderInfoId;

    /**
    * 订单编号
    */
    private String orderNumber;

    /**
    * 商品id
    */
    private Integer productId;

    /**
    * 商品数量
    */
    private String productNum;

    /**
    * 物流单号
    */
    private String logistics;

    /**
    * 预留字段1
    */
    private String orderInfo1;

    /**
    * 预留字段2
    */
    private String orderInfo2;

    public Integer getOrderInfoId() {
        return orderInfoId;
    }

    public void setOrderInfoId(Integer orderInfoId) {
        this.orderInfoId = orderInfoId;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductNum() {
        return productNum;
    }

    public void setProductNum(String productNum) {
        this.productNum = productNum;
    }

    public String getLogistics() {
        return logistics;
    }

    public void setLogistics(String logistics) {
        this.logistics = logistics;
    }

    public String getOrderInfo1() {
        return orderInfo1;
    }

    public void setOrderInfo1(String orderInfo1) {
        this.orderInfo1 = orderInfo1;
    }

    public String getOrderInfo2() {
        return orderInfo2;
    }

    public void setOrderInfo2(String orderInfo2) {
        this.orderInfo2 = orderInfo2;
    }

    public OrderInfo() {
    }

    public OrderInfo(Integer orderInfoId, String orderNumber, Integer productId, String productNum, String logistics, String orderInfo1, String orderInfo2) {
        this.orderInfoId = orderInfoId;
        this.orderNumber = orderNumber;
        this.productId = productId;
        this.productNum = productNum;
        this.logistics = logistics;
        this.orderInfo1 = orderInfo1;
        this.orderInfo2 = orderInfo2;
    }

    @Override
    public String toString() {
        return "OrderInfo{" +
                "orderInfoId=" + orderInfoId +
                ", orderNumber='" + orderNumber + '\'' +
                ", productId=" + productId +
                ", productNum='" + productNum + '\'' +
                ", logistics='" + logistics + '\'' +
                ", orderInfo1='" + orderInfo1 + '\'' +
                ", orderInfo2='" + orderInfo2 + '\'' +
                '}';
    }
}