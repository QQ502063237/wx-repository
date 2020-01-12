package com.weixin.demo;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.weixin.demo.utils.Menu;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) throws Exception {

        SpringApplication.run(DemoApplication.class, args);
        Logger logger = LoggerFactory.getLogger(DemoApplication.class);
        String result = Menu.setButtons();
        JSONObject json = JSON.parseObject(result);
        if("ok".equals(json.get("errmsg"))){
            logger.info("初始化菜单成功...xxx");
        }else {
            logger.info("初始化菜单失败....");
        }
    }

}
