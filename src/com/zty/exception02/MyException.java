/**
 * @author: zty
 * @program: JavaSE
 * @ClassName MyException
 * @description:
 * @create: 2022-02-01 16:56
 * @Version 1.0
 **/
package com.zty.exception02;


//自定义异常类  继承Exception
public class MyException extends Exception{
    //传递数字判断

    private int x;

    public MyException(int a){
        this.x=a;
    }

    //toString:异常的打印信息
    @Override
    public String toString() {
        return "MyException{" +
                "x=" + x +
                "} " + super.toString();
    }
}
