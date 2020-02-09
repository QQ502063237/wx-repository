package com.weixin.demo.mapper;

import com.weixin.demo.entity.orderinfo.OrderInfo;

import java.util.List;

public interface OrderInfoMapper {
    int deleteByPrimaryKey(Integer orderInfoId);

    int insert(OrderInfo record);

    int insertSelective(OrderInfo record);

    OrderInfo selectByPrimaryKey(Integer orderInfoId);

    int updateByPrimaryKeySelective(OrderInfo record);

    int updateByPrimaryKey(OrderInfo record);

    int insertList (List<OrderInfo> orderInfos);
}