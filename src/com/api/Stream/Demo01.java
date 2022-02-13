/**
 * @author: zty
 * @program: JavaSE
 * @ClassName Demo01
 * @description:
 * @create: 2022-02-13 20:34
 * @Version 1.0
 **/
package com.api.Stream;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Demo01 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张天泳");
        list.add("冯梦洁");
        list.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.startsWith("张");
            }
        });

        list.stream().filter(s -> s.startsWith("张")).forEach(s -> System.out.println(s));
    }
}
