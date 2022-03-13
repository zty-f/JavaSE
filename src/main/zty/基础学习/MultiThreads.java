package main.zty.基础学习;

/**
 * @version V1.0
 * @Copyright swpu
 * @author: zty-f
 * @date: 2022/3/13 20:46
 * @Description:  Main线程和子线程的关系
 */
public class MultiThreads {
    public static void main(String[] args) {
        Thread thread = new Thread(()->{
            System.out.println("子线程正在执行·······");
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("子线程结束");
        });
        thread.setDaemon(true);//设置为守护线程  主线程结束即结束
        //不设置默认为用户线程，用户线程不会因为main线程结束马上停止
        thread.start();
        System.out.println("Main线程执行结束");
    }
}
