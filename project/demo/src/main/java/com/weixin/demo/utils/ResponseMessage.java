package com.weixin.demo.utils;


import com.thoughtworks.xstream.XStream;
import com.weixin.demo.entity.Article;
import com.weixin.demo.entity.BasicResponseMessage;
import com.weixin.demo.entity.NewsResponseMessage;
import com.weixin.demo.entity.TextResponseMessage;


import java.util.Map;

//响应消息方法,switch 根据不同类型请求 ,响应不同对象
public class ResponseMessage {

    //根据 请求内容,和设置类型, 设置响应数据 创建响应文本对象返回
    public static  String getResponse( Map<String ,String> requestMap,BasicResponseMessage responseMessageSql){
            String xml="success";
            //响应数据类型
            switch (responseMessageSql.getMsgType()){
                //响应文本消息
                case "text":
                    TextResponseMessage TextResponseMessage=(TextResponseMessage) responseMessageSql;
                    responseMessageSql.setCreateTime(System.currentTimeMillis()/1000+"");
                    responseMessageSql.setToUserName(requestMap.get("FromUserName"));
                    responseMessageSql.setFromUserName(requestMap.get("ToUserName"));
                    xml=beanToXml(TextResponseMessage);
                    System.out.println(xml);
                    break;
                case "image":
                    break;
                case "video":
                    break;
                case "voice":
                    break;
                case "music":
                    break;
                case "news":
                    NewsResponseMessage newsResponseMessage=(NewsResponseMessage) responseMessageSql;
                    responseMessageSql.setCreateTime(System.currentTimeMillis()/1000+"");
                    responseMessageSql.setToUserName(requestMap.get("FromUserName"));
                    responseMessageSql.setFromUserName(requestMap.get("ToUserName"));
                    xml=beanToXml(newsResponseMessage);
                    break;
                default:
                    break;
            }
             return xml;
    }

    //将对象转为微信规定的String 类型的xml
    public static String beanToXml(BasicResponseMessage msg){
            XStream stream=new XStream();
            //设置注解生效
            stream.processAnnotations(TextResponseMessage.class);
            stream.processAnnotations(NewsResponseMessage.class);
            stream.processAnnotations(Article.class);
            //对象转为string xml
            String xml = stream.toXML(msg);

        return xml;
    }


}
