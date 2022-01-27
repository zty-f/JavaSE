package com.zty.踩坑合集;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @author: zty
 * @program: JavaSE
 * @ClassName com.zty.踩坑合集.Date_or_LocalDateTime
 * @description:
 * @create: 2022-01-19 15:20
 * @Version 1.0
 **/

public class Date_or_LocalDateTime {
    public static void main(String[] args) {
        System.out.println("Date使用如下：");//线程不安全！
        Date date = new Date();
        System.out.println(date);
        System.out.println(date.getYear());
        System.out.println(date.getDay());
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(dateFormat.format(date));
        System.out.println("-----------------------------");
        System.out.println("LocalDateTime使用如下：");//线程安全！
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        System.out.println(now.getYear());
        System.out.println(now.format(DateTimeFormatter.ISO_DATE));
        System.out.println(now.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
        System.out.println(now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
    }

}
