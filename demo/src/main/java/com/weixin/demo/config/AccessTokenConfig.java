package com.weixin.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
/*

    类名调用静态方法获取静态属性

 */


@Component
@PropertySource(value="classpath:token.properties")
public class AccessTokenConfig {
    @Value("${url}")
    public   String urlConfig;
    @Value("${appId}")
    private String appIdConfig;
    @Value("${appSecret}")
    private  String  appSecretConfig;

    private static String url;
    private static  String appId;
    private static String  appSecret;

    @PostConstruct
    public void  set(){
        url=this.urlConfig;
        appId=this.appIdConfig;
        appSecret=this.appSecretConfig;

    }

    public static  String getUrl() {
        return url;
    }

    public static String getAppId() {
        return appId;
    }

    public static String getAppSecret() {
        return appSecret;
    }



}
