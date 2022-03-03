/**
 * @author: zty
 * @program: JavaSE
 * @ClassName Student
 * @description:
 * @create: 2022-01-29 16:52
 * @Version 1.0
 **/
package main.zty.oop02;

//类继承只能单继承！！！！接口实现可以多实现！
public class Student extends Person{// 子类

    public Student() {
        //这里隐藏了代码super();  调用父类的无参构造方法
        System.out.println("调用了Student无参构造方法！");
    }

    String name = "Student";
    //快捷键  ctrl+h:查看当前类的继承情况！

    public void test(String name){
        System.out.println(name);//Test
        System.out.println(this.name);//Student
        System.out.println(super.name);//Person  super调用父类的属性或方法（受权限控制）
    }
}
