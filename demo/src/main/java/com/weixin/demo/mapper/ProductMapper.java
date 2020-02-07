package com.weixin.demo.mapper;

import com.weixin.demo.entity.product.Product;

public interface ProductMapper {
    int insert(Product record);

    int insertSelective(Product record);

    //根据id查询商品对象
    Product selectProduct(Integer productId);

}