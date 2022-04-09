package main.thread;
/*
预期结果20000 结果小于20000
volatile有俩个特征：
  1、变量对线程是可见的
 虽然变量对各个线程是可见的， 但是sum++不是原子的，包含了获取值，自增，赋值 每一个操作都可能被其他线程打断 修改了变量的值
  2、防止指令重排
  例子就是双重懒加载的单例模式
 */
public class MutilThreadCount02 implements  Runnable{
    static volatile int sum = 0;
    @Override
    public void run() {
       for (int i = 0; i < 10000; i++) {
           sum++; //不是原子性操作
       }
    }

    public static void main(String[] args) throws InterruptedException {
        MutilThreadCount02 count = new MutilThreadCount02();
        Thread t1 = new Thread(count);
        Thread t2 = new Thread(count);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(sum);
    }
}

