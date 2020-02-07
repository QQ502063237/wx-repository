package com.weixin.demo.mapper;

import com.weixin.demo.entity.car.ShoppingCar;
import com.weixin.demo.entity.vip.Vip;

import java.util.List;

public interface ShoppingCarMapper {
    int insert(ShoppingCar record);

    int insertSelective(ShoppingCar record);

    //更新数量
    int upNumber(ShoppingCar record);
    //删除
    int deleteCarId(List<ShoppingCar> shoppingCarList);
    //查询
    List<ShoppingCar> optionList(List<ShoppingCar> shoppingCarList);

    //根据用户id查询所有购物车数据
    List<ShoppingCar> findById(Vip vip);

}