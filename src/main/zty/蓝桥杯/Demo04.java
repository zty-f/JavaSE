package main.zty.蓝桥杯;

import java.util.Scanner;

//闰年判断
/*
给定一个年份，判断这一年是不是闰年。
当以下情况之一满足时，这一年是闰年：
1. 年份是4的倍数而不是100的倍数；
2. 年份是400的倍数。
其他的年份都不是闰年。
 */
public class Demo04 {
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		int year = s.nextInt();
		String res = "no";
		if(year%4==0&&year%100!=0){
			res = "yes";
		}
		if(year%400==0){
			res = "yes";
		}
		System.out.println(res);
	}
}