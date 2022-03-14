package main.concurrency;
/**
 * @ClassName: main.concurrency.RunnableThread.java
 * @Copyright swpu
 * @author: zty-f
 * @date:  2022-03-14 19:59
 * @version V1.0
 * @Description: 实现Runnable接口
 */
public class RunnableThread implements Runnable {
    public void run() {
        System.out.println(Thread.currentThread().getName()+"线程执行了run方法");
    }
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName()+"线程执行了main方法");
        RunnableThread target = new RunnableThread();
        Thread thread = new Thread(target);
        thread.start();
    }
}
