package com.weixin.demo.mapper;

import com.weixin.demo.entity.vip.Vip;

public interface VipMapper {
    int deleteByPrimaryKey(Integer vipId);

    int insert(Vip record);

    int insertSelective(Vip record);

    Vip selectByPrimaryKey(Integer vipId);

    int updateByPrimaryKeySelective(Vip record);

    int updateByPrimaryKey(Vip record);

    //根据微信id查询对象
    Vip selectByWeChatNum(String weChatNum);
}