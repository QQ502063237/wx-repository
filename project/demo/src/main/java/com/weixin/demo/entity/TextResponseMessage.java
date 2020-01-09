package com.weixin.demo.entity;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import java.util.Map;
//响应文本消息类
@XStreamAlias("xml")
public class TextResponseMessage extends  BasicResponseMessage {
    @XStreamAlias("Content")
    private  String content;

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public TextResponseMessage() {
    }

    //构造方法
    public TextResponseMessage(Map<String,String> requestMap,String content) {
        super(requestMap);
        //创建的时候,继承的父类属性就设置成 text
        this.setMsgType("text");
        this.content=content;
    }

    @Override
    public String toString() {
        return "TextResponseMessage{" +
                "content='" + content + '\'' +
                "toUserName='" + this.getToUserName() + '\'' +
                ", fromUserName='" + this.getFromUserName() + '\'' +
                ", createTime='" + this.getCreateTime() + '\'' +
                ", msgType='" + this.getMsgType() + '\'' +
                '}';
    }
}
