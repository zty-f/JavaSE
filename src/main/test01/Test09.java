package main.test01;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @version V1.0
 * @ClassName: main.test.Test09.java
 * @Copyright swpu
 * @author: zty-f
 * @date: 2022-04-07 20:29
 * @Description: 静态变量
 */
public class Test09 {
    String name;
    int age;//p1输出  Name:zhangsan, Age:10
    //static int age; //p1输出  Name:zhangsan, Age:12  因为static变量在内存只有一个副本

    public String toString() {
        return "Name:" + name + ", Age:" + age;
    }

    public static void main(String[] args) {
        final Test09 p1 = new Test09();

        p1.name = "zhangsan";
        p1.age = 10;
        Test09 p2 = new Test09();
        p2.name = "lisi";
        p2.age = 12;
        System.out.println(p1);
        System.out.println(p2);
        Queue<Integer> pq = new PriorityQueue<>((v1, v2) -> v2 - v1);
    }
    public void AAA(){
        //通过this调用实例方法
        this.test1();

        test2();
    }

    void test1(){

    }

    static void test2(){

    }

    //方法重载  参数列表不同才是必要条件，在参数列表不相同的情况下，返回值可以相同也可以不同。
    // 单纯的使返回值不相同不能构成方法重载！
    public void a(int x,int b){

    }
    public int a(double x,int b){
        return 0;
    }
    public void a(int c,double x){

    }
}
