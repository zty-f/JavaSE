package main.lock;

public class SynchronizedTest03 implements Runnable {
    static SynchronizedTest03 instance = new SynchronizedTest03();
    static int i = 0;
    @Override
    public void run() {
        // 调用
        try {
            method();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public synchronized void method() throws InterruptedException {
        System.out.println("该方法是对象锁的方法修饰符形式， 线程名为:"+ Thread.currentThread().getName());
        Thread.sleep(3000);
        System.out.println(Thread.currentThread().getName()+"运行结束");
    }
    
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(instance);
        Thread t2 = new Thread(instance);
        t1.start();
        t2.start();
        // 线程还存在
        while (t1.isAlive() || t2.isAlive()) {
        }
        System.out.println("运行结束");
    }
}