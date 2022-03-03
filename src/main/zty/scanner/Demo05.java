/**
 * @author: zty
 * @program: JavaSE
 * @ClassName Demo05
 * @description:
 * @create: 2022-01-27 20:08
 * @Version 1.0
 **/
package main.zty.scanner;

import java.util.Scanner;

public class Demo05 {
    public static void main(String[] args) {
        int cnt = 0;
        double sum = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入数据：");

        while(scanner.hasNextDouble()){
            double temp = scanner.nextDouble();
            cnt++;
            sum+=temp;
            System.out.println("你输入的第"+cnt+"个数据后，总和为："+sum);
        }

        System.out.println("输入的"+cnt+"个数据总和为："+sum);
        System.out.println("输入的"+cnt+"个数据平均数为："+(sum/cnt));
        scanner.close();
    }
}
