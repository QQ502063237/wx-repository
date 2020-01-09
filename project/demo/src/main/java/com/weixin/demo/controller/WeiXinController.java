package com.weixin.demo.controller;




import com.weixin.demo.config.ButtonConfig;
import com.weixin.demo.entity.Article;
import com.weixin.demo.entity.BasicResponseMessage;
import com.weixin.demo.entity.NewsResponseMessage;
import com.weixin.demo.entity.TextResponseMessage;
import com.weixin.demo.utils.RequestMessage;
import com.weixin.demo.utils.ResponseMessage;
import com.weixin.demo.utils.TokenUtil;
import org.dom4j.DocumentException;
import org.springframework.web.bind.annotation.*;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.ArrayList;
import java.util.Map;


@RestController
@RequestMapping(value = "wx")
public class WeiXinController {

    @RequestMapping( method = RequestMethod.GET)
    public void get(HttpServletRequest request , HttpServletResponse response) throws Exception {
        String token = TokenUtil.getToken().getAccessToken();
        System.out.println("token是-----"+token);
        System.out.println("进入get 按钮right是:"+ButtonConfig.getRight());
        String echostr = request.getParameter("echostr");
        PrintWriter out = response.getWriter();
        out.print(echostr);
        out.flush();
        out.close();
    }



    @RequestMapping( method = RequestMethod.POST)
    public void post(HttpServletRequest request , HttpServletResponse response) throws IOException, DocumentException {
        response.setCharacterEncoding("UTF-8");
        System.out.println("post方法");
        //将post请求流处理成map
        Map<String, String> requestMap = RequestMessage.requestMap(request);
        System.out.println(requestMap);
        //获取请求内容
        String content = requestMap.get("Content");
        PrintWriter out = response.getWriter();
        //根据请求内容查询数据库 得到响应对象 的类型,数据参数,如果没有直接响应"success"

        //测试响应文本
        BasicResponseMessage textResponseMessageSql=new TextResponseMessage(requestMap,"响应消息");
        //测试响应图文
             /*
             响应参数:
                  参数    	    是否必须 	说明
                ToUserName  	是 	        接收方帐号（收到的OpenID）
                FromUserName 	是 	        开发者微信号
                CreateTime 	    是       	消息创建时间 （整型）
                MsgType 	    是         	消息类型，图文为news
                ArticleCount 	是 	        图文消息个数；当用户发送文本、图片、视频、图文、地理位置这五种消息时，开发者只能回复1条图文消息；其余场景最多可回复8条图文消息
                Articles 	    是 	        图文消息信息，注意，如果图文数超过限制，则将只发限制内的条数
                Title 	        是   	    图文消息标题
                Description 	是   	    图文消息描述
                PicUrl         	是 	        图片链接，支持JPG、PNG格式，较好的效果为大图360*200，小图200*200
                Url 	        是 	        点击图文消息跳转链接
            */
        Article article = new Article("title标题", "图片描述信息",
                "http://mmbiz.qpic.cn/mmbiz_jpg/U743oOejqKhuarbrVJpnBXmBvqlq888gsDwOaZE38MeicnKcAVvt3ibhjdaJ5oBjcparQjP4qZgglMvNHibCdkUFg/0",
                "http://www.baidu.com");
        ArrayList<Article> articles = new ArrayList<>();
        articles.add(article);
        BasicResponseMessage newsResponseMessageSql=new NewsResponseMessage(requestMap,"1",articles);
        if(newsResponseMessageSql!=null){
            String xml = ResponseMessage.getResponse(requestMap, newsResponseMessageSql);
            out.print(xml);
        }else{
            out.print("success");
        }
        out.flush();
        out.close();


    }




}
