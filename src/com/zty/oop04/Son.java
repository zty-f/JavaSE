/**
 * @author: zty
 * @program: JavaSE
 * @ClassName Son
 * @description:
 * @create: 2022-01-29 19:28
 * @Version 1.0
 **/
package com.zty.oop04;

public class Son extends Father{
    @Override
    public void say() {
        System.out.println("son");
    }

    public void unique(){
        System.out.println("子类特有的方法！");
    }
}
