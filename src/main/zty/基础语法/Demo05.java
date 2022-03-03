/**
 * @author: zty
 * @program: JavaSE
 * @ClassName Demo05
 * @description:
 * @create: 2022-01-26 20:38
 * @Version 1.0
 **/
package main.zty.基础语法;

public class Demo05 {

    //类变量 static关键字
    static double salary = 20000;

    // 属性：变量

    //实例变量，成员变量 ;不进行初始化默认为默认值 0 0.0 null
    //布尔值：默认为false
    int age;
    String name;

    public void test(){

    }

    public static void main(String[] args) {
        // 局部变量：必须声明和初始化值！
        System.out.println(salary);
    }
}
