package main.thread;

//没有锁同一个对象，结果还是会错误
public class MutilThreadCount04 implements  Runnable{
    Object lock1 = new Object();
    Object lock2 = new Object();
    static int  sum = 0;
    @Override
    public void run() {
        synchronized (lock1){
            for (int i = 0; i < 100000; i++) {
                sum=sum+1;
            }
        }
        synchronized (lock2){
            for (int i = 0; i < 100000; i++) {
                sum=sum+1;
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MutilThreadCount04 count = new MutilThreadCount04();
        Thread t1 = new Thread(count);
        Thread t2 = new Thread(count);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(sum);
    }
}
