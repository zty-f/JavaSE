package main.test08;

/**
 * @version V1.0
 * @ClassName: main.test08.Test04.java
 * @Copyright swpu
 * @author: zty-f
 * @date: 2022-09-30 21:11
 * @Description:
 */
class P{

    static {
        x = 5;
        System.out.println("static");
    }
    static int x = 2;
    static int y = 2;
    public P(){
        System.out.println("p");
    }

    static {
        y = 5;
        System.out.println("static");
    }
}

public class Test04 extends P{
    Test04(){
        System.out.println("son");
    }

    public static void main(String[] args) {
        System.out.println(P.x); //static变量的赋值操作会进行合并，按照代码顺序进行执行
        System.out.println(P.y); //static变量的赋值操作会进行合并，按照代码顺序进行执行
    }
}
