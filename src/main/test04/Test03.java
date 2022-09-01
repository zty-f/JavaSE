package main.test04;

/**
 * @version V1.0
 * @ClassName: main.test04.Test03.java
 * @Copyright swpu
 * @author: zty-f
 * @date: 2022-09-01 20:44
 * @Description:
 */

interface I{
    public void hello();
}

class Father{
    public void hello(){
        System.out.println("father");
    }
}

class Child extends Father implements I{
    public void hello(){
        System.out.println("child");
    }
}

public class Test03 {
    public static void main(String[] args) {
        I i = new Child();
        Father f = new Child();
        i.hello();
        f.hello();
    }
}
