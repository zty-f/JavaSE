/**
 * @author: zty
 * @program: JavaSE
 * @ClassName Application
 * @description:
 * @create: 2022-01-29 17:21
 * @Version 1.0
 **/
package main.zty.oop03;

public class Application {

    //静态方法和非静态方法区别很大
    /*
    静态方法：方法调用只和左边定义的数据类型有关！

    非静态方法：重写！
     */
    public static void main(String[] args) {
        B b = new B();

        A a = new B();//多态！
        //sta()为静态方法
        b.sta(); //子类的sta方法！
        a.sta(); //父类的sta方法！


        //say()为非静态方法
        a.say();//子类的say方法！
        b.say();//子类的say方法！
    }
}
