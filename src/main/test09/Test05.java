package main.test09;

import java.util.*;

/**
 * @version V1.0
 * @ClassName: main.test09.Test05.java
 * @Copyright swpu
 * @author: zty-f
 * @date: 2022-10-15 21:31
 * @Description:
 */
public class Test05 {
    public static void main(String[] args) {
        long c = 123L;
        //boolean b = null;  // 错误声明
        //float f = 1.23; // 错误声明  默认为double，大于float，必须强转
        float f = 1.211f;
        System.out.println(6+5%3+2);
        System.out.println(Integer.MAX_VALUE*2); //-2
        System.out.println(Integer.MIN_VALUE*2); // 0

        List<String> list  = new ArrayList<>();

        list.add("aaa");
        list.add("aaa");
        list.add("bbb");
        list.add("vvv");

        Set s = new HashSet();
        s.addAll(list);
        System.out.println(s.size());//3

        list.addAll(s);

        Queue q = new LinkedList();  //Queue只是一个接口
        q.addAll(s);

        list.addAll(q);
    }
}
