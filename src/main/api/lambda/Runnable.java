/**
 * @author: zty
 * @program: JavaSE
 * @ClassName Runnable
 * @description:
 * @create: 2022-02-12 20:42
 * @Version 1.0
 **/
package main.api.lambda;

public class Runnable {
    public static void main(String[] args) {
        //1.原始写法
        Thread t = new Thread(new java.lang.Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+":执行~~~");
            }
        });
        t.start();

//2.lambda表达式优化
        Thread t1 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName()+":执行~~~");
        });
        t1.start();
//3.继续优化
        new Thread(() -> {
            System.out.println(Thread.currentThread().getName()+":执行~~~");
        }).start();

//4.一行代码
        new Thread(() -> System.out.println(Thread.currentThread().getName()+":执行~~~")).start();
    }
}
