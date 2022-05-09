package main.test02;

import java.util.Arrays;

/**
 * @version V1.0
 * @ClassName: main.test02.Test06.java
 * @Copyright swpu
 * @author: zty-f
 * @date: 2022-05-09 09:29
 * @Description: 高级排序
 */
public class Test06 {
    public static void main(String[] args) {
        int[] t = new int[]{3,30,34,5,9};
        Integer[] x = new Integer[t.length];
        for (int i = 0; i < x.length; i++) {
            x[i] = t[i];
        }
        Arrays.sort(x,(a,b)->{
            String m = String.valueOf(a);
            String n = String.valueOf(b);
            return (n+m).compareTo(m+n);//保证数组按顺序组成字符串获得数字最大！！！
        });
        System.out.println(Arrays.toString(x));
        StringBuffer s = new StringBuffer();
        s.toString();
    }
}
