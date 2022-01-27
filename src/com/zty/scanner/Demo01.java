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

/*
next():
1、一定要读取到有效字符后才可以结束输入。
2、对输入有效字符之前遇到的空白，next()方法会自动将其去掉。
3、只有输入有效字符后才将其后面输入的空白作为分隔符或者结束符。
4、next()不能得到带有空格的字符串。
--------------------------------------------------------
nextLine():
1、以Enter为结束符,也就是说nextLine()方法返回的是输入回车之前的所有字符。
2、可以获得空白。
 */

public class Demo01 {
    public static void main(String[] args) {
        //创建一个扫描器对象，用于接收键盘数据
        Scanner scanner = new Scanner(System.in);

        System.out.println("使用next方式进行接收：");

        //判断用户有没有输入字符串
        if(scanner.hasNext()){
            //使用next方式接收
            String s = scanner.next();
            System.out.println("输入的内容为："+s);
        }

        //凡是属于io流的类如果不关闭就会一直占用资源，要养成好习惯，用完就关闭！
        scanner.close();
    }
}
