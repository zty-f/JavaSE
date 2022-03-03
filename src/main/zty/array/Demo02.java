/**
 * @author: zty
 * @program: JavaSE
 * @ClassName Demo02
 * @description:
 * @create: 2022-01-28 19:36
 * @Version 1.0
 **/
package main.zty.array;

import java.util.Arrays;

public class Demo02 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};

        System.out.println(a); //[I@1b6d3586
        //打印数组
        System.out.println(Arrays.toString(a)); //[1, 2, 3, 4, 5]

        Arrays.fill(a,0);

        System.out.println(Arrays.toString(a));
    }
}
