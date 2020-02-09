package com.weixin.demo.entity.order;

import java.math.BigDecimal;

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
    private BigDecimal orderMoney;

    /**
     * vipId
     */

    private Integer vipId;

    /**
     * 订单状态id
     *
     */
    private  Integer statuId;


    public Integer getOrderId() {
        return orderId;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public String getOrderTime() {
        return orderTime;
    }

    public BigDecimal getOrderMoney() {
        return orderMoney;
    }

    public Integer getVipId() {
        return vipId;
    }

    public Integer getStatuId() {
        return statuId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }

    public void setOrderMoney(BigDecimal orderMoney) {
        this.orderMoney = orderMoney;
    }

    public void setVipId(Integer vipId) {
        this.vipId = vipId;
    }

    public void setStatuId(Integer statuId) {
        this.statuId = statuId;
    }

    public Order() {
    }

    public Order(Integer orderId, String orderNumber, String orderTime, BigDecimal orderMoney, Integer vipId, Integer statuId) {
        this.orderId = orderId;
        this.orderNumber = orderNumber;
        this.orderTime = orderTime;
        this.orderMoney = orderMoney;
        this.vipId = vipId;
        this.statuId = statuId;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", orderNumber='" + orderNumber + '\'' +
                ", orderTime='" + orderTime + '\'' +
                ", orderMoney=" + orderMoney +
                ", vipId=" + vipId +
                ", statuId=" + statuId +
                '}';
    }
}