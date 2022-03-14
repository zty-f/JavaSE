package main.lock;
/**
 * @ClassName: main.lock.SynchronizedTest02.java
 * @Copyright swpu
 * @author: zty-f
 * @date:  2022-03-14 20:57
 * @version V1.0
 * @Description: 以下输出结果，因为存在两个锁，所以线程不用等待同一把锁，在锁被释放的时候，两个线程可以分别同时获取两把锁，当lock2运行结束后，线程Thread-1就可以拿到lock2锁。
 */
public class SynchronizedTest02 implements Runnable {
    static SynchronizedTest02 instance = new SynchronizedTest02();
    static int i = 0;
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(instance);
        Thread t2 = new Thread(instance);
        t1.start();
        t2.start();
        // 线程还存在
        while (t1.isAlive() || t2.isAlive()) {
            
        }
        System.out.println("线程执行结束");
    }

    Object lock1 = new Object();
    Object lock2 = new Object();
    
    @Override
    public void run() {
        // 第一把锁
        synchronized (lock1) {
            System.out.println("我是lock1，我叫"+ Thread.currentThread().getName());
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"lock1运行结束");
        }
        
        // 第二把锁
        synchronized (lock2) {
            System.out.println("我是lock2，我叫"+ Thread.currentThread().getName());
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"lock2运行结束");
        }
    }
}