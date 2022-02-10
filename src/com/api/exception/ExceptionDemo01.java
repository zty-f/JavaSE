package com.api.exception;

import java.io.FileInputStream;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//编译时异常：
//在出现异常的地方把异常一层一层的抛出给最外层调用者，最外层调用者集中捕获处理！
public class ExceptionDemo01{
    public static void main(String[] args){
        System.out.println("程序开始。。。。");
        try {
            parseDate("2013-03-23 10:19:23");
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("程序结束。。。。");
    }
    public static void parseDate(String time) throws ParseException {
        String s = time;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = sdf.parse(s);//parse方法自己抛出异常，所以我们调用既可以继续向外抛出也可以进行处理
        System.out.println(date);
        //InputStream is = new FileInputStream("D:/meinv.png");
    }
}