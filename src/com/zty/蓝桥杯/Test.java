/**
 * @author: zty
 * @program: JavaSE
 * @ClassName Test
 * @description:
 * @create: 2022-02-18 21:02
 * @Version 1.0
 **/
package com.zty.蓝桥杯;
/*
int
最小值是 -2,147,483,648（-2^31）
最大值是 2,147,483,647（2^31-1）

long
最小值是 -9,223,372,036,854,775,808（-2^63）
最大值是 9,223,372,036,854,775,807（2^63-1）
 */
public class Test {
    public static void main(String[] args) {
        long x = 95152;
        long res = 0;
        res = x*(x-1);
        System.out.println(res);
        res*=x-2;
        System.out.println(res);
    }
}
