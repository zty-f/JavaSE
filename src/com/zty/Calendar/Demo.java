/**
 * @author: zty
 * @program: JavaSE
 * @ClassName Demo
 * @description:
 * @create: 2022-02-02 20:28
 * @Version 1.0
 **/
package com.zty.Calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Demo {
    public static void main(String[] args){
        Calendar rightNow = Calendar.getInstance();
        int year = rightNow.get(Calendar.YEAR);//获取年
        int month = rightNow.get(Calendar.MONTH) + 1;//月要+1
        int days = rightNow.get(Calendar.DAY_OF_YEAR);
        rightNow.set(Calendar.YEAR , 2099);//修改某个字段
        rightNow.add(Calendar.HOUR , 15);//加15小时  -15就是减去15小时
        Date date = rightNow.getTime();//日历对象
        long time = rightNow.getTimeInMillis();//时间毫秒值
        //700天后是什么日子
        rightNow.add(Calendar.DAY_OF_YEAR , 701);
        Date  d = rightNow.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(d));//输出700天后的日期
    }
}
