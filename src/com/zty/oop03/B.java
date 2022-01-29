/**
 * @author: zty
 * @program: JavaSE
 * @ClassName B
 * @description:
 * @create: 2022-01-29 17:22
 * @Version 1.0
 **/
package com.zty.oop03;

public class B extends A{

    public static void sta(){
        System.out.println("子类的sta方法！");
    }

    @Override
    public void say(){
        System.out.println("子类的say方法！");
    }
}
