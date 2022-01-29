/**
 * @author: zty
 * @program: JavaSE
 * @ClassName Demo02
 * @description:
 * @create: 2022-01-29 16:06
 * @Version 1.0
 **/
package com.zty.oop01;

import java.util.Arrays;

public class Demo02 {
    public static void main(String[] args) {
        int[] x = new int[10];
        System.out.println(Arrays.toString(x));//[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
        System.out.println("原数据："+x);//[I@1b6d3586

        change(x);

        System.out.println(Arrays.toString(x));//[100, 100, 100, 100, 100, 100, 100, 100, 100, 100]
        System.out.println("改变后："+x);//[I@1b6d3586
    }

    public static void change(int[] x){//方法参数为引用类型时，相当于传的地址，在实参的内容里面进行修改。
        System.out.println("方法中："+x);//[I@1b6d3586
        Arrays.fill(x,100);
    }
}
