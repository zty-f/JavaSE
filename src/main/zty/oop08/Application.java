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
        //通过外部类来实例化内部类~
        Outer.Inner inner = outer.new Inner();
        inner.in();
        inner.getOuterId();
    }
}
