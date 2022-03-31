/**
 * @author: zty
 * @program: JavaSE
 * @ClassName Application
 * @description:
 * @create: 2022-02-01 15:59
 * @Version 1.0
 **/
package main.zty.oop08;

public class Application {
    public static void main(String[] args) {
        Outer outer = new Outer();
        //通过外部类来实例化普通内部类~
        Outer.Inner inner = outer.new Inner();
        inner.in();
        inner.getOuterId();

        //实例化静态成员内部类
        Outer.StaticInner staticInner = new Outer.StaticInner();
        staticInner.in();
    }
}
