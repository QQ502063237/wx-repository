package com.weixin.demo.service.vipService;

import com.weixin.demo.entity.vip.Vip;
import com.weixin.demo.mapper.VipMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VipServiceImp implements VipService {
    @Autowired
    VipMapper vipMapper;

    @Override
    public Vip selectByWeChatNum(String weChatNum) {
        return vipMapper.selectByWeChatNum(weChatNum);

    }
}
