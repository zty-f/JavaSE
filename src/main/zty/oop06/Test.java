/**
 * @author: zty
 * @program: JavaSE
 * @ClassName Test
 * @description:
 * @create: 2022-01-29 20:12
 * @Version 1.0
 **/
package main.zty.oop06;

public class Test {
    //2. 可以用来在构造方法之前赋初始值！
    {
        System.out.println("匿名代码块！");
    }

    //1.只执行一次！！！！！！
    static {
        System.out.println("静态代码块！");
    }
    //3.
    public Test() {
        System.out.println("无参构造方法！");
    }

    public static void main(String[] args) {
        new Test();
        System.out.println("==========================");
        new Test();
    }
    //输出
    /*
        静态代码块！
        匿名代码块！
        无参构造方法！
     */
}
