package com.zty.蓝桥杯;

import java.math.BigDecimal;
import java.util.Scanner;
//求1到n的和！！！！！
//公式：sum = n*(n+1)/2
public class Demo01 {
	public static void main(String[]args){
		  Scanner s = new Scanner(System.in);
		  int n = s.nextInt();
		BigDecimal res = new BigDecimal(0);
		res = new BigDecimal(n).multiply(new BigDecimal(n+1));
		res = res.divide(new BigDecimal(2));
		System.out.println(res);
	}
}