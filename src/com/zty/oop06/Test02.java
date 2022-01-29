/**
 * @author: zty
 * @program: JavaSE
 * @ClassName Test02
 * @description:
 * @create: 2022-01-29 20:19
 * @Version 1.0
 **/
package com.zty.oop06;


//静态导入其他包中的东西  类中可以直接使用！
import static java.lang.Math.random;
import static java.lang.Math.PI;


public final class Test02 { //使用final定义的类不能被继承！！！！！！  Math类也不能被继承(含有关键词final)
    public static void main(String[] args) {
        //没有导入之前
        System.out.println(Math.random());
        System.out.println(Math.PI);

        //导入静态方法和常量后
        System.out.println(random());
        System.out.println(PI);
    }
}
