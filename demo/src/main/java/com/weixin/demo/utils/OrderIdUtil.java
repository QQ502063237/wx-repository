package com.weixin.demo.utils;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

//31位订单号 ,_后是时间
public class OrderIdUtil {
    //生成订单号 :
    public static String getId(String weChatNum){
        int machineId = 1;//最大支持1-9个集群机器部署
        int hashCodeV = UUID.randomUUID().toString().hashCode();
        if(hashCodeV < 0) {//有可能是负数
            hashCodeV = - hashCodeV;
        }
        // 0 代表前面补充0
        // 4 代表长度为4
        // d 代表参数为正数型
        return machineId + String.format("%015d", hashCodeV)+"_"+weChatNum+getTime();
    }


    //格式当前时间
    public  static String  getTime(){
        Date date = new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddHHmmss");
        String time = sdf.format(date);
        return time;
    }
}
