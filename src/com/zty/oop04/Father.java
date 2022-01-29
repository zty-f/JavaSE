/**
 * @author: zty
 * @program: JavaSE
 * @ClassName Father
 * @description:
 * @create: 2022-01-29 19:28
 * @Version 1.0
 **/
package com.zty.oop04;

public class Father {
    public void say(){
        System.out.println("father");
    }
}
//多态注意事项
/*
   1.多态是方法的多态，属性没有多态
   2.多态的父类和子类才行，要有联系，不然会转换异常！ ClassCastException！
   3.存在条件： 继承关系，方法需要重写，父类引用指向子类对象！ Father f = new Son();

        不能重写的情况：
            1.static方法，属于类，不属于实例。
            2.final 常量。
            3.private方法。
 */