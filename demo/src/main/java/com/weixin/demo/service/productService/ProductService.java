package com.weixin.demo.service.productService;

import com.weixin.demo.entity.product.Product;

public interface ProductService {
    //查询商品
    Product selectById(Integer productId);

}
