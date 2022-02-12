/**
 * @author: zty
 * @program: JavaSE
 * @ClassName Demo02
 * @description:
 * @create: 2022-02-12 20:51
 * @Version 1.0
 **/
package com.api.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
方法引用
基本介绍
方法引用：方法引用是为了进一步简化Lambda表达式的写法
方法引用的格式：类型或者对象::引用的方法
关键语法是：::
 */
public class Demo02 {
    public static void main(String[] args) {
        List<Integer> lists1 = Arrays.asList(1,2,3,4);
        lists1.forEach( s -> System.out.println(s));
        // 方法引用！
        lists1.forEach(System.out::println);

        List<Student> lists = new ArrayList<>();//...s1 s2 s3
        Student s1 = new Student("a", 1);
        Student s2 = new Student("b", 2);
        Student s3 = new Student("c", 3);
        Collections.addAll(lists , s1 , s2 , s3);
        //定义集合加入几个Student元素
        // 使用静态方法进行简化！
        //Collections.sort(lists, (o1, o2) -> Student.compareByAge(o1 , o2));
        // 如果前后参数是一样的，而且方法是静态方法，既可以使用静态方法引用
        Collections.sort(lists, Student::compareByAge);

        System.out.println(lists);
    }
}
