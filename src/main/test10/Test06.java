package main.test10;

import java.util.Arrays;

/**
 * @version V1.0
 * @ClassName: main.test10.Test06.java
 * @Copyright swpu
 * @author: zty-f
 * @date: 2023-02-28 14:49
 * @Description: 引用传递or值传递
 */
public class Test06 {

    public static void main(String[] args) {
        int[] x = new int[5];
        test(x);
        System.out.println(Arrays.toString(x));
        StringBuffer s = new StringBuffer("1");
        test1(s);
        System.out.println(s);
    }

    public static void test(int[] t){
        t[0] = 1;
        System.out.println(Arrays.toString(t));
    }
    public static void test1(StringBuffer t){
        t.append("2");
        System.out.println(t);
    }
}
