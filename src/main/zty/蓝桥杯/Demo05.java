package main.zty.蓝桥杯;

import java.text.DecimalFormat;

//01字串
/*
对于长度为5位的一个01串，每一位都可能是0或1，一共有32种可能。它们的前几个是：
00000
00001
00010
00011
00100
请按从小到大的顺序输出这32种01串。
 */
public class Demo05 {
	public static void main(String[]args){
		for (int i = 0; i <= 31; i++) {
			String binary = Integer.toBinaryString(i);
			//指定输出格式！！！
			System.out.println(new DecimalFormat("00000").format(Integer.parseInt(binary)));
		}
	}
}