package com.weixin.demo.test;


import com.weixin.demo.utils.OrderIdUtil;



public class Test {
    public  static void main(String[] args) throws Exception {
        String str = OrderIdUtil.getId("");
//        String str = OrderIdUtil.getTime();
        String[] s = str.split("_");
        String substring = s[1].substring(0, 4);
        String substring1= s[1].substring(4, 6);
        String substring2 = s[1].substring(6, 8);
        String substring3= s[1].substring(8, 10);
        String substring4= s[1].substring(10, 12);
        String substring5= s[1].substring(12, 14);
        System.out.println(s[1]);
        System.out.println(substring+"年"+substring1+"月"+substring2+"日"+substring3+":"+substring4+":"+substring5);


    }

}
