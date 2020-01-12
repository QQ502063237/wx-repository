package com.weixin.demo.entity;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

//响应图文消息类
@XStreamAlias("xml")
public class NewsResponseMessage extends BasicResponseMessage {
    @XStreamAlias("ArticleCount")
    private  String articleCount;
    @XStreamAlias("Articles")
    private List<Article> articles=new ArrayList<Article>();





    public String getArticleCount() {
        return articleCount;
    }

    public List<Article> getArticles() {
        return articles;
    }

    public void setArticleCount(String articleCount) {
        this.articleCount = articleCount;
    }

    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }
    //构造
    public NewsResponseMessage(){

    }
    public NewsResponseMessage(Map<String,String> requestMap,String articleCount,ArrayList articles){
        super(requestMap);
        this.articleCount=articleCount;
        this.articles=articles;
        this.setMsgType("news");

    }

    @Override
    public String toString() {
        return "NewsResponseMessage{" +
                "articleCount='" + articleCount + '\'' +
                ", articles=" + articles +
                "toUserName='" + this.getToUserName() + '\'' +
                ", fromUserName='" + this.getFromUserName() + '\'' +
                ", createTime='" + this.getCreateTime() + '\'' +
                ", msgType='" + this.getMsgType() + '\'' +
                '}';
    }
}
