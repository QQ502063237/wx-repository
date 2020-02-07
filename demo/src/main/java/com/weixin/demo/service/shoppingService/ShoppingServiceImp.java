package com.weixin.demo.service.shoppingService;

import com.weixin.demo.entity.car.ShoppingCar;
import com.weixin.demo.entity.vip.Vip;
import com.weixin.demo.mapper.ShoppingCarMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ShoppingServiceImp implements ShoppingService {

    @Autowired
    private ShoppingCarMapper shoppingCarMapper;



    //更新数量
    @Override
    public int upNumber(ShoppingCar record) {
        int flag = shoppingCarMapper.upNumber(record);
        return flag;
    }

    //删除数据
    @Override
    public int deleteCarId(List<ShoppingCar> shoppingCarList) {
        int flag = shoppingCarMapper.deleteCarId(shoppingCarList);
        return flag;
    }

    @Override
    public List<ShoppingCar> optionList(List<ShoppingCar> shoppingCarList) {
        List<ShoppingCar> all = shoppingCarMapper.optionList(shoppingCarList);
        return all;
    }

    @Override
    public List<ShoppingCar> byWeChatNum(Vip vip) {
       return shoppingCarMapper.byWeChatNum(vip);
    }


}
