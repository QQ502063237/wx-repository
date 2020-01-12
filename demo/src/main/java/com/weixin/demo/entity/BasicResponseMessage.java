package com.weixin.demo.entity;


import com.thoughtworks.xstream.annotations.XStreamAlias;

import java.util.Map;

//响应消息封装 父类 所以消息回复基类
public class BasicResponseMessage {
    //共同基本属性
    @XStreamAlias("ToUserName")
    private String toUserName;
    @XStreamAlias("FromUserName")
    private String fromUserName;
    @XStreamAlias("CreateTime")
    private  String createTime;
    @XStreamAlias("MsgType")
    private String  msgType;

    public String getToUserName() {
        return toUserName;
    }

    public String getFromUserName() {
        return fromUserName;
    }

    public String getCreateTime() {
        return createTime;
    }

    public String getMsgType() {
        return msgType;
    }

    public void setToUserName(String toUserName) {
        this.toUserName = toUserName;
    }

    public void setFromUserName(String fromUserName) {
        this.fromUserName = fromUserName;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public void setMsgType(String msgType) {
        this.msgType = msgType;
    }

    public BasicResponseMessage() {
    }

    //构造方法,发送方接受方 时间戳 是从请求里面取的
    public BasicResponseMessage(Map<String,String> requestMap){
        this.toUserName=requestMap.get("FromUserName");
        this.fromUserName=requestMap.get("ToUserName");
        this.createTime=System.currentTimeMillis()/1000+"";
    }


    @Override
    public String toString() {
        return "BasicResponseMessage{" +
                "toUserName='" + toUserName + '\'' +
                ", fromUserName='" + fromUserName + '\'' +
                ", createTime='" + createTime + '\'' +
                ", msgType='" + msgType + '\'' +
                '}';
    }
}
