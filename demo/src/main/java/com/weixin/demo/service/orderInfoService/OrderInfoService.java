package com.weixin.demo.service.orderInfoService;

import com.weixin.demo.entity.orderinfo.OrderInfo;

import java.util.List;

public interface OrderInfoService {
    //批量插入订单详情
    int insertList(List<OrderInfo> orderInfos);
}
