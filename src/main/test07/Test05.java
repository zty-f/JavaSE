package main.test07;

/**
 * @version V1.0
 * @ClassName: main.test07.Test05.java
 * @Copyright swpu
 * @author: zty-f
 * @date: 2022-09-24 20:59
 * @Description:
 */
class Super{
    protected static String x = "super member";

    static {
        System.out.println("super static");
    }

    public Super(){
        System.out.println(x);
        System.out.println("super construct");
    }
}

public class Test05 extends Super{
    protected static String x = "child member";

    static {
        System.out.println("child static");
    }

    public Test05(){
        System.out.println(x);
        System.out.println("child construct");
    }

    public static void main(String[] args) {
        System.out.println(x);
        new Test05();
        System.out.println(X.x);
    }
}

interface X{
    int x = 0;
}
