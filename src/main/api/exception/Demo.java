package main.api.exception;

import java.util.Scanner;
/*
    1.运行时异常被抛出可以不处理，可以自动抛出；编译时异常必须处理；按照规范都应该处理
    2.重写方法申明抛出的异常，子类方法抛出的异常类型必须是父类抛出异常类型或为其子类型
    3.方法默认都可以自动抛出运行时异常， throws RuntimeException 可以省略不写
    4.当多异常处理时，捕获处理，前面的异常类不能是后面异常类的父类。
    5.在 try/catch 后可以追加 finally 代码块，其中的代码一定会被执行，通常用于资源回收操作
 */
public class Demo{
    public static void main(String[] args){
        //请输入一个合法的年龄
        while(true){
            try{
                Scanner sc = new Scanner(System.in);
                System.out.println("请您输入您的年年龄：");
                int age = sc.nextInt();
                System.out.println("年龄："+age);
                break;
            }catch(Exception e){
                System.err.println("您的年龄是瞎输入的！");
            }
        }
    }
}