package com.weixin.demo.service.shoppingService;


import com.weixin.demo.entity.car.ShoppingCar;
import com.weixin.demo.entity.vip.Vip;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ShoppingService {
    //更新数量
    int upNumber(ShoppingCar record);
    //删除数据
    int deleteCarId(List<ShoppingCar>  shoppingCarList);
    //查询数据
    List<ShoppingCar> optionList(List<ShoppingCar> shoppingList);

    //根据用户id查询所有购物车数据
    List<ShoppingCar> findById(Vip vip);


}
