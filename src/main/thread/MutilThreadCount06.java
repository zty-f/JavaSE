package main.thread;

//锁类下面所有对象，两个不同线程对象也可以 结果正确
public class MutilThreadCount06 implements  Runnable{

    static int  sum = 0;
    @Override
    public void run() {
        synchronized (MutilThreadCount06.class){
            for (int i = 0; i < 100000; i++) {
                sum=sum+1;
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MutilThreadCount06 count1 = new MutilThreadCount06();
        MutilThreadCount06 count2 = new MutilThreadCount06();

        Thread t1 = new Thread(count1);
        Thread t2 = new Thread(count2);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(sum);
    }
}
