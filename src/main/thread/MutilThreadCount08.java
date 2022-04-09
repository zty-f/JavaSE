package main.thread;

import java.util.concurrent.atomic.AtomicInteger;
//使用原子类进行操作  结果正确
public class MutilThreadCount08 implements  Runnable{
    static AtomicInteger sum = new AtomicInteger();
    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
            sum.addAndGet(1);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MutilThreadCount08 count = new MutilThreadCount08();
        Thread t1 = new Thread(count);
        Thread t2 = new Thread(count);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(sum);
    }
}
