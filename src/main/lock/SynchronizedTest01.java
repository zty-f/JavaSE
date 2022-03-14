package main.lock;

/**
 * @version V1.0
 * @Copyright swpu
 * @author: zty-f
 * @date: 2022/3/14 20:41
 * @Description:
 */
/*
    1. 修饰一个代码块，被修饰的代码块称为同步语句块，其作用的范围是大括号{}括起来的代码，作用的对象是调用这个代码块的对象。
　　2. 修饰一个方法，被修饰的方法称为同步方法，其作用的范围是整个方法，作用的对象是调用这个方法的对象。
　　3. 修饰一个静态的方法，其作用的范围是整个静态方法，作用的对象是这个类的所有对象。
　　4. 修饰一个类，其作用的范围是synchronized后面括号括起来的部分，作用的对象是这个类的所有对象。
 */
    /*
    synchronized两种用法
　　1. 对象锁
　　　　包括方法锁（默认锁对象为this当前实例对象）和同步代码块锁（自己指定锁对象）。
　　　　synchronized(this|object) {}
　　　　synchronized(类.class) {}
　　2. 类锁
　　　　指Synchronized修饰的静态的方法或指定锁为Class对象。
     */
public class SynchronizedTest01 implements Runnable{
    static SynchronizedTest01 instance = new SynchronizedTest01();
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

    @Override
    public void run() {
        synchronized (this) {
            System.out.println("我是对象锁的代码块形式，我叫"+ Thread.currentThread().getName());
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println("我是对象锁的代码块形式，我叫"+ Thread.currentThread().getName()+"运行结束");
        }
    }
}
