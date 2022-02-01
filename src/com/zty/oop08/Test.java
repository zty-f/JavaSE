/**
 * @author: zty
 * @program: JavaSE
 * @ClassName Test
 * @description:
 * @create: 2022-02-01 16:10
 * @Version 1.0
 **/
package com.zty.oop08;

public class Test {
    public static void main(String[] args) {
        //没有名字初始化类，不用讲实例保存到变量中~
        new A().eat();//匿名类使用
    }
}

class A{
    public void eat(){
        System.out.println("sssssss");
    }
}