package com.weixin.demo.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.weixin.demo.config.AccessTokenConfig;
import com.weixin.demo.entity.AccessToken;
/*
    获取 access_token 方法
    access_token 获取次数有限的所以要存起来
    如果没用超时就用原来那个,如果超时了就调用获取方法重新获取赋值上
 */


public class TokenUtil {
    //用于将获取到的accessToken存起来
    private  static  AccessToken accessToken;

    //如果token过期了就会掉用此方法重新获取
    private static void newToken() throws Exception {
        //获取请求地址,(替换APPID,和APPSECRET)
        String url =AccessTokenConfig.getUrl().replace("APPID",AccessTokenConfig.getAppId()).replace("APPSECRET",AccessTokenConfig.getAppSecret());
        String response = HttpClient.get(url);
        JSONObject jsonObject = JSON.parseObject(response);
        String Token = jsonObject.getString("access_token");
        String expiresIn=jsonObject.getString("expires_in");
        //创建token
        accessToken= new AccessToken(Token, expiresIn);
    }

    //获取token方法
    public static AccessToken getToken() throws Exception {
        //如果对象为空 或者token时间超时
        if(accessToken==null||accessToken.isExpired()){
            //重新获取token方法
            newToken();
        }
        return accessToken;
    }
}
