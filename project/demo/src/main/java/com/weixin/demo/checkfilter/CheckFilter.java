package com.weixin.demo.checkfilter;

import com.weixin.demo.utils.CheckRequest;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
自定义拦截器

/*
  接受用户微信公众号  发送消息 Request 里面带了四个参数
    参数 	    描述
    signature 	微信加密签名，signature结合了开发者填写的token参数和请求中的timestamp参数、nonce参数。
    timestamp 	时间戳
    nonce 	    随机数
    echostr 	随机字符串


 */


public class CheckFilter implements HandlerInterceptor {

    /**
     * 进入controller方法之前调用
     * 这里主要验证是来自微信公众号服务器的请求
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
                             Object arg2) throws Exception {
        //取出请求中的参数
        String signature = request.getParameter("signature");
        String timestamp = request.getParameter("timestamp");
        String nonce = request.getParameter("nonce");
        String echostr = request.getParameter("echostr");
        //校验请求
        boolean flag = CheckRequest.checkFilter(timestamp, nonce, signature);
        //判断请求
        if (!flag){
            System.out.println("进入controller方法之前调用--------非公众号请求" );
            return  false;
        }
        System.out.println("进入controller方法之前调用-------公众号请求" +signature+timestamp+nonce+echostr);
        return true;
    }


    /**
     * 进入controller方法之后，渲染视图之前调用
     */
    @Override
    public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
                           Object arg2, ModelAndView arg3) throws Exception {
        System.out.println("进入controller方法之后，渲染视图之前调用");
    }


    /**
     * 完成整个请求之后调用
     */
    @Override
    public void afterCompletion(HttpServletRequest arg0,
                                HttpServletResponse arg1, Object arg2, Exception arg3)
            throws Exception {
        System.out.println("完成整个请求之后调用");
    }



}
