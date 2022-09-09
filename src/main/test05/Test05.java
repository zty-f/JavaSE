package main.test05;

/**
 * @version V1.0
 * @ClassName: main.test05.Test05.java
 * @Copyright swpu
 * @author: zty-f
 * @date: 2022-09-09 15:15
 * @Description: 继承测试
 */

class Super{
    public  String name = "zty";


}
public class Test05 extends Super{

    public static void main(String[] args) {
        Test05 x = new Test05();
        System.out.println(x.name); // zty
    }
}
