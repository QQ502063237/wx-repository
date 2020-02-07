package com.weixin.demo.entity.productimg;

public class ProductImg {
    private Integer productImgId;

    /**
    * 商品id
    */
    private Integer productId;

    /**
    * 商品图片地址
    */
    private String productUrl;

    public Integer getProductImgId() {
        return productImgId;
    }

    public void setProductImgId(Integer productImgId) {
        this.productImgId = productImgId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductUrl() {
        return productUrl;
    }

    public void setProductUrl(String productUrl) {
        this.productUrl = productUrl;
    }

    @Override
    public String toString() {
        return "ProductImg{" +
                "productImgId=" + productImgId +
                ", productId=" + productId +
                ", productUrl='" + productUrl + '\'' +
                '}';
    }
}