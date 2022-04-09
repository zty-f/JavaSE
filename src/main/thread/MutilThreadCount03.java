package main.thread;

//锁代码块，结果正确
public class MutilThreadCount03 implements  Runnable{
    static volatile int sum = 0;
    @Override
    public void run() {
       for (int i = 0; i < 100000; i++) {
           synchronized (this){
               sum++; //不是原子性操作
           }
       }
    }

    public static void main(String[] args) throws InterruptedException {
        MutilThreadCount03 count = new MutilThreadCount03();
        Thread t1 = new Thread(count);
        Thread t2 = new Thread(count);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(sum);
    }
}

