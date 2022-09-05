package main.test05;

/**
 * @version V1.0
 * @ClassName: main.test05.Test03.java
 * @Copyright swpu
 * @author: zty-f
 * @date: 2022-09-05 21:01
 * @Description: 继承关系
 */
class A{
    public void a(){
        System.out.println("AAA");
    }
}

class B extends A{
    public void a(){
        System.out.println("BBB");
    }
}

public class Test03 {

    static void b(Object o){
        System.out.println("Object");
    }

    static void b(A o){  // 编译期间确定，所以调用这个方法（看左边）
        System.out.println("AAAAA");
        o.a();//运行时确定，看右边，调用B重写的方法。
    }

    static void b(B o){
        System.out.println("BBBBB");
        o.a();
    }
     void x(Object o){
        System.out.println("Object");
    }

     void x(A o){
        System.out.println("AAAAA");
        o.a();
    }

     void x(B o){
        System.out.println("BBBBB");
        o.a();
    }

    public static void main(String[] args) {
        A n = new B();
        b(n); //输出 AAAAA BBB

        Test03 t = new Test03();
        t.x(n); //和上面一样
        // 参数传递类型看左边，运行调用看右边。
    }
}
