/**
 * @author: zty
 * @program: JavaSE
 * @ClassName Abstract
 * @description:
 * @create: 2022-01-29 20:30
 * @Version 1.0
 **/
package com.zty.oopabstract;

//抽象类
public abstract class Abstract {

    //抽象方法，没有方法体
    public abstract void test();


    //普通方法
    public void say(){

    }

    //不能new抽象类，只能靠子类去实现它！ #约束！
}