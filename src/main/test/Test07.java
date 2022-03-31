package main.test;

/**
 * @version V1.0
 * @ClassName: main.test.Test07.java
 * @Copyright swpu
 * @author: zty-f
 * @date: 2022-03-31 19:57
 * @Description: 构造方法测试
 */
class Person{
    //public Person(int a){
    //
    //}
}
class A extends Person{
    //编译错误 因为父类没有对应的构造方法
    /*public A(){

    }*/
}
public class Test07 {
    public static void main(String[] args) {
        new A();
    }
}
