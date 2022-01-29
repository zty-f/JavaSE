/**
 * @author: zty
 * @program: JavaSE
 * @ClassName Person
 * @description:
 * @create: 2022-01-29 16:44
 * @Version 1.0
 **/
package com.zty.oop01;

public class Person {//封装：私有-属性，公开-方法！！！！
    //封装的好处：
    /*
    1.提高程序安全性，保护数据
    2.隐藏代码的实现细节
    3.统一接口（set/get）
    4.系统可维护增加
     */

    //通过private将属性私有化！
    private int age;
    private String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    //封装的统一接口
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
