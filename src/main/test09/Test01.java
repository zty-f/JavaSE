package main.test09;

/**
 * @version V1.0
 * @ClassName: main.test09.Test01.java
 * @Copyright swpu
 * @author: zty-f
 * @date: 2022-10-10 20:56
 * @Description: 字符串
 */
public class Test01 {
    public static void main(String[] args) {
        System.out.println("is "+100+5);
        System.out.println(100+5+" is");
        System.out.println("is "+(100+5));
    }

    // 方法重载：参数列表的个数不同、类型顺序不同、类型不同，都能加做重载
    // 修饰符、返回值不能作为判断重载的条件
    public void a(int a,int b,float c){}
    protected void a(int a,float b,int c){}
    private int a(int a,int b){return 0;}
    double a(float a,int b){return 0;}
}
