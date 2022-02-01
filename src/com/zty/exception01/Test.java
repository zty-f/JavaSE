/**
 * @author: zty
 * @program: JavaSE
 * @ClassName Test
 * @description:
 * @create: 2022-02-01 16:28
 * @Version 1.0
 **/
package com.zty.exception01;

public class Test {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try {  //try监控区域
            System.out.println(a/b);
        }catch (ArithmeticException e){ //catch 捕获异常
            e.printStackTrace();
            System.out.println("异常，不能除0");
        }finally {//处理善后工作
            System.out.println("不管有没有异常都会执行。");
        }
    }
}
