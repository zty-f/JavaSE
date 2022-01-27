/**
 * @author: zty
 * @program: JavaSE
 * @ClassName Demo01
 * @description:
 * @create: 2022-01-27 17:13
 * @Version 1.0
 **/
package com.zty.scanner;

import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        //创建一个扫描器对象，用于接收键盘数据
        Scanner scanner = new Scanner(System.in);

        System.out.println("使用nextLine方式进行接收：");

        //判断用户有没有输入字符串
        if(scanner.hasNextLine()){
            //使用nextLine方式接收
            String s = scanner.nextLine();
            System.out.println("输入的内容为："+s);
        }

        //凡是属于io流的类如果不关闭就会一直占用资源，要养成好习惯，用完就关闭！
        scanner.close();
    }
}
