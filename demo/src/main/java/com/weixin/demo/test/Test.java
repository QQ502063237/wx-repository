package com.weixin.demo.test;


import com.weixin.demo.utils.OrderIdUtil;



public class Test {
    public  static void main(String[] args) throws Exception {
        String str = OrderIdUtil.getId("");
//        String str = OrderIdUtil.getTime();
        System.out.println(str);


    }

}
