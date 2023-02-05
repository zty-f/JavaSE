package main.test10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * @version V1.0
 * @ClassName: main.test10.Test05.java
 * @Copyright swpu
 * @author: zty-f
 * @date: 2023-02-05 16:27
 * @Description: 测试list
 */
public class Test05 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(0, 6));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, -5, 0));
        System.out.println(new HashSet<>(list2).containsAll(list1));
    }
}
