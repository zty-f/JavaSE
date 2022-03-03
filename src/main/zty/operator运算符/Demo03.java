/**
 * @author: zty
 * @program: JavaSE
 * @ClassName Demo03
 * @description:
 * @create: 2022-01-27 16:11
 * @Version 1.0
 **/
package main.zty.operator运算符;

public class Demo03 {
    public static void main(String[] args) {
        //短路运算
        int a = 1;
        boolean x = (a>2)&&(a++>=2); //当第一个条件已经是错误的时候，&&后面的将不在执行
        System.out.println(x);
        System.out.println(a);

        //类似如下
        boolean y = (a==1)||(a-->1); //有一个条件正确即为正确！
        System.out.println(y);
        System.out.println(a);
    }
}
