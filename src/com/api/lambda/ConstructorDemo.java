package com.api.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntFunction;
/*
格式：类名::new
注意事项：前后参数一致的情况下，又在创建对象，就可以使用构造器引用
 */
public class ConstructorDemo {
    public static void main(String[] args) {
        List<String> lists = new ArrayList<>();
        lists.add("java1");
        lists.add("java2");
        lists.add("java3");

        // 集合默认只能转成Object类型的数组。
        Object[] objs = lists.toArray();


        //使用构造器
        String[] strs1 = lists.toArray(new String[0]);


        System.out.println("String类型的数组："+ Arrays.toString(strs1));
    }
}