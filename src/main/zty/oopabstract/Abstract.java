/**
 * @author: zty
 * @program: JavaSE
 * @ClassName Abstract
 * @description:
 * @create: 2022-01-29 20:30
 * @Version 1.0
 **/
package main.zty.oopabstract;

//抽象类
public abstract class Abstract {
    //抽象类可以有构造方法，但是不能实例化new
    public Abstract() {
        System.out.println("抽象类的构造方法！");
    }

    //抽象方法，没有方法体
    public abstract void test();


    //普通方法
    public void say(){

    }

    //不能new抽象类，只能靠子类去实现它！ #约束！
}
