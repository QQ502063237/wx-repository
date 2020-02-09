package com.weixin.demo.service.orderService;

import com.weixin.demo.entity.order.Order;
import com.weixin.demo.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImp implements OrderService {
    @Autowired
    OrderMapper orderMapper;

    @Override
    public int insertOrder(Order order) {
        System.out.println("Imp"+order.toString());
        int flag = orderMapper.insert(order);
        return flag;
    }
}
