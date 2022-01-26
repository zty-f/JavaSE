/**
 * @author: zty
 * @program: JavaSE
 * @ClassName Demo06
 * @description:
 * @create: 2022-01-26 20:47
 * @Version 1.0
 **/
package 基础语法;

public class Demo06 {
    // 常量
    // static 和 final修饰符不区分先后顺序
    static final double PI = 3.14;
    final int AGE = 100;

    /*
    1.所有变量、方法、类名:见名知意
    2.类成员变量:首字母小写和驼峰原则: monthSalary
    3.局部变量:首字母小写和驼峰原则
    4.常量:大写字母和下划线:MAX_VALUE
    5.类名:首字母大写和驼峰原则: Man, GoodMan方法名:
    6.首字母小写和驼峰原则: run(), runRun()
     */


    public static void main(String[] args) {
        System.out.println(PI);

        System.out.println(new Demo06().AGE);
    }
}
