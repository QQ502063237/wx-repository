package com.weixin.demo.config;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;


//配置公众号按钮 配置对象
@Component
@PropertySource(value="classpath:button.properties")
public class ButtonConfig {
    //左边按钮子菜单数量
    @Value("${button.left}")
    private  int leftConifg;
    //中间按钮子菜单数量
    @Value("${button.centre}")
    private   int centreConig;
    //右边按钮子菜单数量
    @Value("${button.right}")
    private  int rightConfig;

    private static int left;
    private static int centre;
    private  static int right;

    @PostConstruct
    public void set(){
        left=this.leftConifg;
        centre=this.centreConig;
        right=this.rightConfig;
    }

    public static int getLeft() {
        return left;
    }
    public static int getCentre() {
        return centre;
    }
    public  static  int getRight() {
        return right;
    }


}
