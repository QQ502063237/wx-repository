package com.weixin.demo.service.orderInfoService;

import com.weixin.demo.entity.orderinfo.OrderInfo;
import com.weixin.demo.mapper.OrderInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderInfoServiceImp implements  OrderInfoService {
    @Autowired
    OrderInfoMapper orderInfoMapper;


    //遍历插入订单详情,也可以mapper.xml 用动态sql遍历插入
    @Override
    public int insertList(List<OrderInfo> orderInfos) {
        int count=0;
        for (int i=0;count<orderInfos.size();i++){
           orderInfoMapper.insertSelective(orderInfos.get(i));
           count++;
        }
        return count;
    }
}
