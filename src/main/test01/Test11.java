package main.test01;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @version V1.0
 * @ClassName: main.test.Test11.java
 * @Copyright swpu
 * @author: zty-f
 * @date: 2022-04-15 09:36
 * @Description: 数组排序
 */
public class Test11 {
    public static void main(String[] args) {
        Integer[] x = new Integer[]{3,30,34,5,9};
        Arrays.sort(x,(a,b)->b-a);
        System.out.println(Arrays.toString(x));
        String[] t = new String[x.length];
        for (int i = 0; i < x.length; i++) {
            t[i] = String.valueOf(x[i]);
        }
        Arrays.sort(t, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                StringBuffer x = new StringBuffer(o1);
                StringBuffer y = new StringBuffer(o2);
                return x.append(y).toString().compareTo(y.append(x).toString());
            }
        });
        System.out.println(Arrays.toString(t));
        System.out.println(getWord(1));
        System.out.println(getWord(26));
        int q = 1225;

    }
    public static char getWord(int x){
        return (char) (x+96);
    }
}
