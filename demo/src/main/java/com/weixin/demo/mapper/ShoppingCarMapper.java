package com.weixin.demo.mapper;

import com.weixin.demo.entity.car.ShoppingCar;

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

}