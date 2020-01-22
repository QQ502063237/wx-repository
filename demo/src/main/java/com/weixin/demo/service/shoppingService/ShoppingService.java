package com.weixin.demo.service.shoppingService;


import com.weixin.demo.entity.car.ShoppingCar;

import java.util.List;


public interface ShoppingService {
    //更新数量
    int upNumber(ShoppingCar record);
    //删除数据
    int deleteCarId(List<ShoppingCar>  shoppingCarList);
    //查询数据
    List<ShoppingCar> optionList(List<ShoppingCar> shoppingList);

}
