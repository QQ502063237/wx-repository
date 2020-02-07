package com.weixin.demo.entity.vip;

public class Vip {
    /**
    * id
    */
    private Integer vipId;

    /**
    * 微信号
    */
    private String wechatNum;

    /**
    * 成长值
    */
    private Integer exPoint;

    /**
    * 积分
    */
    private Integer point;

    /**
    * 会员等级id
    */
    private Integer lvId;

    public Integer getVipId() {
        return vipId;
    }

    public void setVipId(Integer vipId) {
        this.vipId = vipId;
    }

    public String getWechatNum() {
        return wechatNum;
    }

    public void setWechatNum(String wechatNum) {
        this.wechatNum = wechatNum;
    }

    public Integer getExPoint() {
        return exPoint;
    }

    public void setExPoint(Integer exPoint) {
        this.exPoint = exPoint;
    }

    public Integer getPoint() {
        return point;
    }

    public void setPoint(Integer point) {
        this.point = point;
    }

    public Integer getLvId() {
        return lvId;
    }

    public void setLvId(Integer lvId) {
        this.lvId = lvId;
    }
}