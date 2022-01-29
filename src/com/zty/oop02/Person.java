/**
 * @author: zty
 * @program: JavaSE
 * @ClassName Person
 * @description:
 * @create: 2022-01-29 16:52
 * @Version 1.0
 **/
package com.zty.oop02;

// Java中所有类都直接或间接继承Object类

//人 父类
public class Person {
    public Person() {
        System.out.println("调用了Person无参构造方法！");
    }

    String name = "Person";

    //访问权限优先级  public属性可以被继承
    /*
    public
    protected
    default
    private
     */
    public int money = 10000;

    public void run(){
        System.out.println("Live!");
    }
}
