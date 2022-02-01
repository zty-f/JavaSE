/**
 * @author: zty
 * @program: JavaSE
 * @ClassName Demo03
 * @description:
 * @create: 2022-02-01 16:45
 * @Version 1.0
 **/
package com.zty.exception01;

public class Demo03 {
    public static void main(String[] args) {
        new Demo03().test(1,0);
        //调用方法抛出异常，这里的后续代码也不继续执行！
        //要想继续运行后续代码需要将上述调用方法用try-catch包裹起来！
        System.out.println("类方法运行结束！");
    }

    //假设这个方法处理不了这个异常，可以方法上抛出异常
    public void test(int a,int b) throws ArithmeticException{
        if(b==0){  // throw
            throw new ArithmeticException();//主动抛出异常，一般在方法中使用
        }  //有异常就结束这个方法，不继续执行。
        System.out.println(a/b);
        System.out.println("方法结束！");
    }
}
