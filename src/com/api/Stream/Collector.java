/**
 * @author: zty
 * @program: JavaSE
 * @ClassName Collectors
 * @description:
 * @create: 2022-02-13 21:00
 * @Version 1.0
 **/
package com.api.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Collector {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张天泳");
        list.add("张天泳1");
        list.add("冯梦洁");
        Stream<String> stream = list.stream().filter(s -> s.startsWith("张"));
        //把stream流转换成Set集合。
        Set<String> set = stream.collect(Collectors.toSet());
        System.out.println(set);

        //把stream流转换成List集合。
        //重新定义，因为资源已经被关闭了
        Stream<String> stream1 = list.stream().filter(s -> s.startsWith("张"));
        List<String> list_v = stream1.collect(Collectors.toList());
        System.out.println(list_v);

        //把stream流转换成数组。
        Stream<String> stream2 = list.stream().filter(s -> s.startsWith("张"));
        // 可以借用构造器引用申明转换成的数组类型！！！
        String[] arr1 = stream2.toArray(String[]::new);
        System.out.println(Arrays.toString(arr1));
    }
}
