package com.weixin.demo.service.vipService;

import com.weixin.demo.entity.vip.Vip;

public interface VipService {
    //根据微信号查询用户号
    Vip selectByWeChatNum(String weChatNum);


}
