/**
 * @author: zty
 * @program: JavaSE
 * @ClassName Demo02
 * @description:
 * @create: 2022-01-27 16:03
 * @Version 1.0
 **/
package main.zty.operator运算符;

public class Demo02 {
    public static void main(String[] args) {
        int x =1;
        int a = ++x; //先执行x+1，再把值赋给a
        int b = x++;// 先把x的值赋给b，再执行x+1
        System.out.println(a);
        System.out.println(b);
        System.out.println(x);
    }
}
