package main.test03;

import java.util.ArrayList;
import java.util.List;

/**
 * @version V1.0
 * @ClassName: main.test03.Test03.java
 * @Copyright swpu
 * @author: zty-f
 * @date: 2022-07-31 16:22
 * @Description: ArrayList测试
 */


public class Test03 {
    static List<Integer> list = new ArrayList<>();

    public static void main(String args[]){
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.remove(Integer.valueOf(4));

        System.out.println(list);
    }
}
