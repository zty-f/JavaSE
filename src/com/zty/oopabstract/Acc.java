/**
 * @author: zty
 * @program: JavaSE
 * @ClassName Acc
 * @description:
 * @create: 2022-01-29 20:32
 * @Version 1.0
 **/
package com.zty.oopabstract;

//继承抽象类时子类必须重写父类的所有抽象方法！
public class Acc extends Abstract{
    @Override
    public void test() {
        System.out.println("重写抽象类的抽象方法！");
    }
}
