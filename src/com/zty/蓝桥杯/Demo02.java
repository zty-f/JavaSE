/**
 * @author: zty
 * @program: JavaSE
 * @ClassName Demo02
 * @description:
 * @create: 2022-02-18 16:47
 * @Version 1.0
 **/
package com.zty.蓝桥杯;


import java.text.DecimalFormat;
import java.util.Scanner;

//求圆的面积
public class Demo02 {
    private static final double PI = 3.14159265358979323;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        System.out.println(new DecimalFormat("0.0000000").format(r*r*PI));
    }
}
