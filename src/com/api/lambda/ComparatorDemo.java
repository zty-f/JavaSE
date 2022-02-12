/**
 * @author: zty
 * @program: JavaSE
 * @ClassName ComparatorDemo
 * @description:
 * @create: 2022-02-12 20:47
 * @Version 1.0
 **/
package com.api.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {
    public static void main(String[] args) {
        List<Student> lists = new ArrayList<>();//...s1 s2 s3
        Student s1 = new Student("a", 1);
        Student s2 = new Student("b", 2);
        Student s3 = new Student("c", 3);
        Collections.addAll(lists , s1 , s2 , s3);
        //Collections.sort(lists, new Comparator<Student>() {
        //    @Override
        //    public int compare(Student s1, Student s2) {
        //        return s1.getAge() - s2.getAge();
        //    }
        //});
        //
        //// 简化写法
        //Collections.sort(lists ,(Student t1, Student t2) -> {
        //    return t1.getAge() - t2.getAge();
        //});
        // 参数类型可以省略,最简单的   默认升序排列
        Collections.sort(lists ,(t1,t2) -> t2.getAge()-t1.getAge());
        System.out.println(lists);
    }
}
