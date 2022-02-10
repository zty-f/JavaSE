/**
 * @author: zty
 * @program: JavaSE
 * @ClassName GenericDemo1
 * @description:
 * @create: 2022-02-10 20:24
 * @Version 1.0
 **/
package com.api.customgeneric;

import java.util.Arrays;

public class GenericDemo1 {
    public static void main(String[] args) {
        Integer[] nums = {10 , 20 , 30 , 40 , 50};
        String s1 = arrToString(nums);

        String[] names = {"张三","李四","王五"};
        String s2 = arrToString(names);

        System.out.println(s1);
        System.out.println(s2);
    }

    //自定义泛型方法
    public static <T> String arrToString(T[] arr){
        return Arrays.toString(arr);
    }
}
