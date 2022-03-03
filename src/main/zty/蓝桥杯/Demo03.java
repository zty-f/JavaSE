/**
 * @author: zty
 * @program: JavaSE
 * @ClassName Demo02
 * @description:
 * @create: 2022-02-18 16:47
 * @Version 1.0
 **/
package main.zty.蓝桥杯;

import java.util.Scanner;

//Fibonacci数列
/*
问题描述
Fibonacci数列的递推公式为：Fn=Fn-1+Fn-2，其中F1=F2=1。
当n比较大时，Fn也非常大，现在我们想知道，Fn除以10007的余数是多少。
 */
public class Demo03 {
    public static void main(String[] args) {
        int mod = 10007;
        Scanner scanner = new Scanner(System.in);
        int f1 = 1,f2 = 1;
        int n = scanner.nextInt();
        int res = 0;
        if(n<=2){
            System.out.println(1);
            return;
        }
        for (int i = 3; i <= n; i++) {
            res = (f1+f2)%mod;
            f1 = f2%mod;
            f2 = res%mod;
        }
        System.out.println(res);
    }
}
