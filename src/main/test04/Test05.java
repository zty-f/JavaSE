package main.test04;

/**
 * @version V1.0
 * @ClassName: main.test04.Test05.java
 * @Copyright swpu
 * @author: zty-f
 * @date: 2022-09-01 20:58
 * @Description: 运行时类型判断
 */
interface Interface{

}

class F{

}

class C extends F implements Interface{

}

public class Test05 {
    public static void main(String[] args) {
        F o = new C();
        change(o);//调用静态方法，编译时确定类型    编译看左边，运行看右边！ F
    }


    public static void change(Interface i){
        System.out.println("i");
    }
    public static void change(Object i){
        System.out.println("o");
    }
    public static void change(F i){
        System.out.println("f");
    }
    public static void change(C i){
        System.out.println("c");
    }
}
