package com.weixin.demo.controller;


import com.weixin.demo.entity.car.ShoppingCar;
import com.weixin.demo.entity.order.Order;
import com.weixin.demo.service.shoppingService.ShoppingService;
import com.weixin.demo.utils.OrderIdUtil;
import com.weixin.demo.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

//购物车页
@RestController
@RequestMapping("/shoppingCar")
public class CartController {
    @Autowired
    private ShoppingService shoppingService;

    //更新购物车数据
    @RequestMapping(value = "upNum",method = RequestMethod.POST)
    public Result upNum(@RequestBody ShoppingCar shoppingCar){
        boolean booleanCarId=shoppingCar.getCarId()!=null&&shoppingCar.getCarId()>0;
        boolean booleanCarNum=shoppingCar.getCarNum()!=null&&shoppingCar.getCarNum()>0&&shoppingCar.getCarNum()<9999;
        Result result = new Result("202", "failed", null, null);
        if(booleanCarId&&booleanCarNum){
            int flag= shoppingService.upNumber( shoppingCar);
            result.setCode(flag>0?"200":"202");
            result.setMessage(flag>0? "succeed":"failed");
        }
        return  result;
    }

    //删除购物车数据
    @RequestMapping(value = "delete",method = RequestMethod.POST)
    public Result delete(@RequestBody List<ShoppingCar> shoppingCarList){
        Result result = new Result("202", "failed", null, null);
        int flag = shoppingService.deleteCarId(shoppingCarList);
        if(flag>0){
            result.setCode(flag>0?"200":"202");
            result.setMessage(flag>0? "succeed":"failed");
        }
        return  result;
    }
    //生成订单,查询,删除购物车,生成订单,同一事物
    @RequestMapping(value = "account",method = RequestMethod.POST)
    @Transactional
    public  Result account(@RequestBody List<ShoppingCar> shoppingCarList){
        //查询
        List<ShoppingCar> optionList = shoppingService.optionList(shoppingCarList);
        if(optionList.size()>0){
            //删除购物车
            int flag = shoppingService.deleteCarId(optionList);
            //订单:订单号,订单时间,订单金额,用户id
            //详情:详情id,订单号,商品id,商品数量


        }


        return null;
    }

    //创建订单对象
    public Order getOrder(List<ShoppingCar> shoppingCarList){
        //获取微信号
        String weChatNum = shoppingCarList.get(0).getWeChatNum();
        //创建订单号
        String orderId = OrderIdUtil.getId(weChatNum);



        Order order = new Order();



        return null;
    }
    //创建订单详情对象









}
