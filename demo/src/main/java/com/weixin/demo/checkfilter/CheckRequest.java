package com.weixin.demo.checkfilter;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CheckRequest implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //super.addInterceptors(registry);
        //拦截所有请求, (提供接口的请求不需要过滤器校验 ,添加白名单)
//        registry.addInterceptor(new CheckFilter()).addPathPatterns("/**");
    }
}
