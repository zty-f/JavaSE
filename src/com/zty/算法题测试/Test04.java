/**
 * @author: zty
 * @program: JavaSE
 * @ClassName Test04
 * @description:
 * @create: 2022-02-11 10:34
 * @Version 1.0
 **/
package com.zty.算法题测试;

import java.util.Arrays;

public class Test04 {
    public static void main(String[] args) {
        int[] x = new int[]{1,2,3,4,5,6,7};
        int[] y = Arrays.copyOfRange(x,1,x.length);//[2, 3, 4, 5, 6, 7]
        for (int i = 0; i < x.length; i++) {
            if (x[i] == 4){
                System.out.println(i);
                break;
            }
        }
        System.out.println(Arrays.toString(y));
    }
}
