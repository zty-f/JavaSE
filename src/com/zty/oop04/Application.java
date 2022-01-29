/**
 * @author: zty
 * @program: JavaSE
 * @ClassName Application
 * @description:
 * @create: 2022-01-29 19:28
 * @Version 1.0
 **/
package com.zty.oop04;

public class Application {
    public static void main(String[] args) {

        //new的对象可以指向的引用类型不唯一：父类的引用指向子类
        Son son = new Son();
        Father son1 = new Son();

        //son类可以调用自己独有的方法或父类的或重写的方法
        son.say();
        son.unique();

        //上转型对象只能调用父类基础的方法或重写的方法，不能调用独有的方法，要想调用就需要先类型转换
        son1.say();
        ((Son)son1).unique();

        //对象能调用哪些方法，主要看左边的类型，和右边的关系不大！
    }
}
