package com.weixin.demo.controller;




import com.weixin.demo.config.MenuConfig;
import com.weixin.demo.entity.BasicResponseMessage;
import com.weixin.demo.entity.TextResponseMessage;
import com.weixin.demo.utils.RequestMessage;
import com.weixin.demo.utils.ResponseMessage;
import com.weixin.demo.utils.TokenUtil;
import org.dom4j.DocumentException;
import org.springframework.web.bind.annotation.*;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Map;


@RestController
@RequestMapping()
public class WeiXinController {
    @RequestMapping( method = RequestMethod.GET)
    public void get(HttpServletRequest request , HttpServletResponse response) throws Exception {
        String token = TokenUtil.getToken().getAccessToken();
        System.out.println("token是--...---"+token);
        System.out.println("进入get 按钮right是:"+ MenuConfig.getRight());
        String echostr = request.getParameter("echostr");
        PrintWriter out = response.getWriter();
        out.print(echostr);
        out.flush();
        out.close();
    }



    @RequestMapping( method = RequestMethod.POST)
    public void post(HttpServletRequest request , HttpServletResponse response) throws IOException, DocumentException {
        response.setCharacterEncoding("UTF-8");
        //将post请求流处理成map
        Map<String, String> requestMap = RequestMessage.requestMap(request);
        String signature = request.getParameter("signature");
        System.out.println("post方法"+requestMap);
        PrintWriter out = response.getWriter();
        String event = requestMap.get("Event");
        //如果是个订阅事件
        if (event!=null&&event.equals("subscribe")){//返回欢迎消息
            BasicResponseMessage textResponseMessageSql=new TextResponseMessage(requestMap,"欢迎关注xxx公众号/...........");
            String xml=ResponseMessage.beanToXml(textResponseMessageSql);
            out.print(xml);
        }else{
            out.print("");
        }
        out.flush();
        out.close();
    }




}
