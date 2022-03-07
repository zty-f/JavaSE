package main.zty.基础学习;

/*
如果try语句里有return，那么代码的行为如下：
1.如果有返回值，就把返回值保存到局部变量中
2.执行jsr指令跳到finally语句里执行
3.执行完finally语句后，返回之前保存在局部变量表里的值

如果try，finally语句里均有return，忽略try的return，而使用finally的return.
 */
public class CupImpl implements Cup{
     static int a;//可以不用赋值，成员变量会有默认值

    public static void main(String[] args) {
        byte a1 = 2, a2 = 4, a3;
        short s = 16;
        /*
        低转高 自动；高转低 强制；
        byte short char int float long double
         */
        a2 = (byte) s;
        a3 = (byte) (a1 * a2); //byte和short型在计算时会自动转换为int型计算，结果也是int 型。所以a1*a2的结果是int 型的
        loop();
    }
    @Override
    public void use() {//实现接口中的方法范围修饰符只能是public
        System.out.println(a);
    }
    public static void loop(){//loop可以用作方法名
        int b;//可以不用赋值，如果不使用就不会保持。
        b = 2;//可以先定义再初始化
        System.out.println(a);//静态方法只能引用静态成员变量
        System.out.println(b);
    }
}
