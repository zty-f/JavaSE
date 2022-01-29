/**
 * @author: zty
 * @program: JavaSE
 * @ClassName Application
 * @description:
 * @create: 2022-01-29 16:55
 * @Version 1.0
 **/
package com.zty.oop02;

public class Application {
    public static void main(String[] args) {
        /*
        输出：
        调用了Person无参构造方法！
        调用了Student无参构造方法！
         */
        Student student = new Student();
        student.run();
        student.test("Test");
    }
}
