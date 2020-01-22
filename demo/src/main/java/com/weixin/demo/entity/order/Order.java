package com.weixin.demo.entity.order;

public class Order {
    private Integer orderId;

    /**
    * 订单编号
    */
    private String orderNumber;

    /**
    * 下单时间
    */
    private String orderTime;

    /**
    * 订单金额
    */
    private Long orderMoney;

    private Integer userId;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }

    public Long getOrderMoney() {
        return orderMoney;
    }

    public void setOrderMoney(Long orderMoney) {
        this.orderMoney = orderMoney;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}