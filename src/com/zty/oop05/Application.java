/**
 * @author: zty
 * @program: JavaSE
 * @ClassName Application
 * @description:
 * @create: 2022-01-29 19:28
 * @Version 1.0
 **/
package com.zty.oop05;

public class Application {
    public static void main(String[] args) {
        //Object > String
        //Object > Father > Son
        //Object > Father > Girl
        Object son = new Son();
        System.out.println(son instanceof Object);//true
        System.out.println(son instanceof Father);//true
        System.out.println(son instanceof Son);//true
        System.out.println(son instanceof Girl);//false
        System.out.println(son instanceof String);//false

        System.out.println("==============================================");
        Father son1 = new Son();
        System.out.println(son1 instanceof Object);//true
        System.out.println(son1 instanceof Father);//true
        System.out.println(son1 instanceof Son);//true
        System.out.println(son1 instanceof Girl);//false
        //System.out.println(son1 instanceof String); 编译报错！

        System.out.println("==============================================");
        Son son2 = new Son();
        System.out.println(son2 instanceof Object);//true
        System.out.println(son2 instanceof Father);//true
        System.out.println(son2 instanceof Son);//true
        //System.out.println(son2 instanceof Girl);   编译报错！
        //System.out.println(son1 instanceof String); 编译报错！

    }
}
