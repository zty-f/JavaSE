package main.zty.蓝桥杯;

import java.util.Scanner;

//数列特征  给出n个数，找出这n个数的最大值，最小值，和。
public class Demo07 {
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int sum = 0;
		int max = -10001;
		int min = 10001;
		for (int i = 0; i < n; i++) {
			int tmp = scanner.nextInt();
			sum+=tmp;
			max = Math.max(max,tmp);
			min = Math.min(min,tmp);
		}
		System.out.println(max+"\n"+min+"\n"+sum);
		scanner.close();
	}
}