package com.weixin.demo.service.productService;

import com.weixin.demo.entity.product.Product;
import com.weixin.demo.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImp implements ProductService {
    @Autowired
    private ProductMapper productMapper;

    //传入id查询商品
    @Override
    public Product selectById(Integer productId) {
       return productMapper.selectById(productId);
    }
}
