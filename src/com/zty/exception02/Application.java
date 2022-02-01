/**
 * @author: zty
 * @program: JavaSE
 * @ClassName Application
 * @description:
 * @create: 2022-02-01 16:59
 * @Version 1.0
 **/
package com.zty.exception02;

public class Application {

    public static void main(String[] args) {
        try {
            test(11);
        } catch (MyException e) {
            System.out.println("MyException=>"+e);
            e.printStackTrace();
        }
    }


    //可能存在异常的方法
     public static void test(int a) throws MyException{
         System.out.println("传递参数为:"+a);
         if(a>10){
            throw new MyException(a);
        }
         System.out.println("OK");
    }
}
