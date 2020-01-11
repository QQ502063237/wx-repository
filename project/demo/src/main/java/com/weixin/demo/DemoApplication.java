package com.weixin.demo;

import com.weixin.demo.utils.Menu;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(DemoApplication.class, args);
        System.out.println("启动项目成功+初始化菜单.............");
        String result = Menu.setButtons();
        System.out.println(result);
    }

}
