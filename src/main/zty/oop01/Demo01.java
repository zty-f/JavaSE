/**
 * @author: zty
 * @program: JavaSE
 * @ClassName Demo01
 * @description:
 * @create: 2022-01-29 16:00
 * @Version 1.0
 **/
package main.zty.oop01;

//    面向对象三大特征：封装、继承、多态！

public class Demo01 {
    public static void main(String[] args) {
        //总结：
        /*
        1.静态方法在类加载的时候就已经存在
        2.非静态方法必须在类实例化的时候才会产生（new）
         */
    }
    public void a(){  //a可以直接调用b
        b();
    }

    public void b(){
        a();
    }

    public static void aa(){//aa可以调用bb
        bb();
    }

    public static void bb(){
        aa();
    }

    public static void x(){//x不可以调用y
        //y();//报错
    }

    public  void y(){
        x();//y可以调用x
    }


}
