package com.weixin.demo.entity;

/*
    接口响应的token对象(access_token属性,expires_in 属性)
    转换为 实体类AccessToken对象
    属性:access_token 字符串
    属性:expireTime  会过期的时间
 */



public class AccessToken {
    private  String accessToken;
    //过期时间
    private  long expireTime;

    public String getAccessToken() {
        return accessToken;
    }

    public long getExpireTime() {
        return expireTime;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public void setExpireTime(long expireTime) {
        this.expireTime = expireTime;
    }
    //构造方法,会过期的时间=当前时间+token超时时间(7200)
    public AccessToken(String accessToken, String  expiresIn) {
        this.accessToken = accessToken;
        this.expireTime = System.currentTimeMillis() + Integer.parseInt(expiresIn)*1000;
    }

    //根据当前时间和过期时间expireTime对比是否过期了,true过期了
    public  boolean isExpired(){
        return System.currentTimeMillis() > this.expireTime;
    }
}
