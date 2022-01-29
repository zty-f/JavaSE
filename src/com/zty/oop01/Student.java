/**
 * @author: zty
 * @program: JavaSE
 * @ClassName Demo03
 * @description:
 * @create: 2022-01-29 16:17
 * @Version 1.0
 **/
package com.zty.oop01;

public class Student {//封装：私有-属性，公开-方法！！！！

    //不加访问修饰符默认是default，同包下可以访问
     String name;
    private int age;
    //在没有有参构造时，类会默认生成一个无参构造方法
    public Student(){

    }
    //在声明了有参构造后，如果还想调用无参构造就必须在类中写出无参构造方法
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
