package main.concurrency;
/**
 * @ClassName: main.concurrency.CustomThread.java
 * @Copyright swpu
 * @author: zty-f
 * @date:  2022-03-14 19:54
 * @version V1.0
 * @Description:  继承Thread类，重写Run方法
 */
public class CustomThread extends Thread {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName()+"线程调用了main方法");
        for (int i = 0; i < 5; i++) {
            if (i == 1) {
                CustomThread customThread = new CustomThread();
                customThread.start();
                System.out.println(Thread.currentThread().getName()+"线程--i是"+i);
            }
        }
        System.out.println("main()方法执行完毕！");
    }
    public void run() {
        System.out.println(Thread.currentThread().getName()+"线程调用了run()方法");
        for (int j = 0; j < 5; j++) {
            System.out.println(Thread.currentThread().getName()+"线程进行中"+j);
        }
        System.out.println("run()方法执行完毕！");
    }
}