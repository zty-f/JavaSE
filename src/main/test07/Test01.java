package main.test07;

import java.util.ArrayList;
import java.util.List;

/**
 * @version V1.0
 * @ClassName: main.test07.Test01.java
 * @Copyright swpu
 * @author: zty-f
 * @date: 2022-09-20 15:44
 * @Description:
 */
public class Test01 {
    static class A{

    }

    static class B extends A{

    }
    public static void main(String[] args) {
        List<A> list = new ArrayList<A>();

        list.add(new B());

        test(list);

        int i = 8;
        System.out.println(++i+1);// 10 -》 i->9
        System.out.println(i+++1);// 10
    }
    public static void test(List<? super A> list){
        for (int i = 0; i < list.size(); i++) {
            //A a = list.get(0); // 编译错误
        }
    }
}
