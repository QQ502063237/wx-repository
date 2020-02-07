package com.weixin.demo.controller;


import com.weixin.demo.entity.car.ShoppingCar;
import com.weixin.demo.entity.order.Order;
import com.weixin.demo.service.productService.ProductService;
import com.weixin.demo.service.shoppingService.ShoppingService;
import com.weixin.demo.service.vipService.VipService;
import com.weixin.demo.utils.OrderIdUtil;
import com.weixin.demo.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.*;

//购物车页
@RestController
@RequestMapping("/shoppingCar")
public class CartController {
    @Autowired
    private ShoppingService shoppingService;

    @Autowired
    private ProductService productService;
    @Autowired
    private VipService vipService;



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


    //提交结算,生成订单,删除购物车,生成订单,同一事物
    @RequestMapping(value = "account",method = RequestMethod.POST)
    @Transactional
    public  Result account(@RequestBody List<ShoppingCar> shoppingCarList){
        //查询
        List<ShoppingCar> optionList = shoppingService.optionList(shoppingCarList);
        if(optionList.size()>0){
            //删除购物车
            int flag = shoppingService.deleteCarId(optionList);
            //获取订单对象
            Order order = getOrder(optionList);
            //插入订单数据

            //详情:详情id,订单号,商品id,商品数量


        }


        return null;
    }

    //创建订单对象
    public Order getOrder(List<ShoppingCar> optionList){
        //获取微信号
        String weChatNum = optionList.get(0).getWeChatNum();
        //获取用户号
        Integer userId = vipService.selectByWeChatNum(weChatNum).getVipId();
        //创建订单号
        String orderNumber = OrderIdUtil.getId(weChatNum);
        //创建订单时间
        String[] s = orderNumber.split("_");
        String substring = s[1].substring(0, 4);
        String substring1= s[1].substring(4, 6);
        String substring2 = s[1].substring(6, 8);
        String substring3= s[1].substring(8, 10);
        String substring4= s[1].substring(10, 12);
        String substring5= s[1].substring(12, 14);
        String orderTime=(substring+"年"+substring1+"月"+substring2+"日"+substring3+":"+substring4+":"+substring5);
        //查询购物车每件物品,计算合计金额
        BigDecimal multiply=new BigDecimal(0);
        for(int i=0;i<optionList.size();i++){
            //根据商品id查询商品单价
            int productId=optionList.get(i).getProductId();
            //商品数量,转换为bigDecimal
            int carNum=optionList.get(i).getCarNum();
            BigDecimal num = new BigDecimal(carNum);
            //商品单价
            BigDecimal price = productService.selectProduct(productId).getProductMoney();
            //单个和
            BigDecimal sum = price.multiply(num);
            //求全部金额
            multiply=multiply.add(sum);
        }
        Order order = new Order();
        order.setOrderNumber(orderNumber);
        order.setOrderTime(orderTime);
        order.setOrderMoney(multiply);
        order.setUserId(userId);
        return order;
    }
    //创建订单详情对象









}
