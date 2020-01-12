package com.weixin.demo.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public class CheckRequest {
    //管理平台配置的token
    public  static final  String TOKEN ="abcd";

    /*
    验证是来自微信服务器的请求方法
      1.(token+timestamp+nonce)组成字符串数组
      2.对字符串数组进行字典排序,转为字符串
      3.在调用sha1算法,对字符串进行加密
      4.加密结果和signature进行比较
     */

    public  static boolean  checkFilter(String timestamp,String nonce,String signature){
        //1.将token,timestamp,nonce进行字典排序
        String[] strs=new String[]{TOKEN,timestamp,nonce};
        Arrays.sort(strs);
        //2.将三个字符串拼接成一个字符串进行加密
        String str=strs[0]+strs[1]+strs[2];
        //将sb字符串进行sh1加密
        String mysig = sha1(str);
        //加密结果mysig和signature进行比较
        System.out.println("signature----"+signature+"------mysig----"+mysig);
        return signature.equals(mysig);
    }

    //sha1加密方法
    public  static String sha1(String str){
        try {
            //获取一个加密对象,摘要加密算法
            MessageDigest md = MessageDigest.getInstance("sha1");
            //加密操作
            byte[] digest = md.digest(str.getBytes());
            char[] chars = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
            StringBuilder sb = new StringBuilder();
            //处理加密结果 移位操作
            for (byte b : digest) {
                sb.append(chars[(b >> 4) & 15]);
                sb.append(chars[b & 15]);
            }
            return sb.toString();
        }catch (NoSuchAlgorithmException e){
            e.printStackTrace();
        }
        return  "error";
    }
}
