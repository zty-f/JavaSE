/**
 * @author: zty
 * @program: JavaSE
 * @ClassName Demo01
 * @description:
 * @create: 2022-02-12 20:19
 * @Version 1.0
 **/
package com.api.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
/*
 -如果Lambda表达式的方法体代码只有一行代码，可以省略大括号不写，同时要省略分号；如果这行代码是return语句，必须省略return不写
 -参数类型可以省略不写
 -如果只有一个参数，参数类型可以省略，同时()也可以省略
 */
public class Demo01 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("胡");
        names.add("甘");
        names.add("洪");

        names.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        names.forEach((String s) -> {
            System.out.println(s);
        });

        names.forEach((s) -> {
            System.out.println(s);
        });

        names.forEach(s -> {
            System.out.println(s);
        });

        //最终简化形式
        names.forEach(s -> System.out.println(s) );
    }
}
