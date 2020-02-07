package com.weixin.demo.mapper;

import com.weixin.demo.entity.productimg.ProductImg;

public interface ProductImgMapper {
    int insert(ProductImg record);

    int insertSelective(ProductImg record);
}