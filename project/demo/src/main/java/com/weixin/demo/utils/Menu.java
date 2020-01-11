package com.weixin.demo.utils;

import com.alibaba.fastjson.JSON;
import com.weixin.demo.config.MenuConfig;
import com.weixin.demo.entity.Button;
import com.weixin.demo.entity.ClickButton;
import com.weixin.demo.entity.SubButton;
import com.weixin.demo.entity.ViewButton;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;


//设置菜单
public class Menu {
    public  static String setButtons() throws Exception {
        Button btns= new Button();
        //获取数组集合 往集合里添加button
        //第一个一级菜单,加入集合
        btns.getButton().add(new ClickButton("一级点击","1"));
        //第二个一级菜单,加入集合
        btns.getButton().add(new ViewButton("一级跳转","http://www.baidu.com"));
        //创建第第三个一级菜单,加入集合(第三个是带有子菜单的)
        SubButton sub = new SubButton("有子菜单");
        sub.getSub_button().add(new ViewButton("子1菜单","http://www.hao123.com"));
        sub.getSub_button().add(new ViewButton("子2菜单","http://www.baidu.com"));
        //添加第三个菜单到集合
        btns.getButton().add(sub);
        // 发送请求到微信 设置菜单
        String url= MenuConfig.getUrl().replace("ACCESS_TOKEN",TokenUtil.getToken().getAccessToken());
        String menuData = JSON.toJSONString(btns);
        System.out.println(TokenUtil.getToken().getAccessToken());
        return postRequest(url,menuData);
    }


    //post请求
    public static String postRequest(String urls, String  menuData) throws Exception {
        // 访问准备
        StringBuilder sb = new StringBuilder();
            URL url = new URL(urls);
            // 开始访问
            byte[] menuDataBytes =menuData.getBytes("UTF-8");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            conn.setRequestProperty("Content-Length", String.valueOf(menuDataBytes.length));
            conn.setDoOutput(true);
            conn.getOutputStream().write(menuDataBytes);
            Reader in;
            in = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
            for (int c; (c = in.read()) >= 0;)
                sb.append((char) c);
        String response = sb.toString();
        return response;
    }

}
