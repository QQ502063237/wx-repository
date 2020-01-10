package com.weixin.demo.test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.weixin.demo.entity.AccessToken;
import com.weixin.demo.entity.Button;
import com.weixin.demo.entity.ViewButton;
import com.weixin.demo.utils.TokenUtil;



public class Test {
    public  static void main(String[] args) throws Exception {

        Button button = new Button();
        button.getButton().add(new ViewButton("www.baudu.com"));
        String str = JSON.toJSONString(button);

        System.out.println(str);


    }

}
