package main.thread;


//预期结果是20000，两个线程运行过程中可能会出现重复读的情况，所以结果可能小于20000
public class MutilThreadCount01 implements  Runnable{
    static int sum = 0;
    @Override
    public void run() {
            for (int i = 0; i < 10000; i++) {
                sum++;
            }
    }

    public static void main(String[] args) throws InterruptedException {
        MutilThreadCount01 count = new MutilThreadCount01();
        Thread t1 = new Thread(count);
        Thread t2 = new Thread(count);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(sum);
    }
}
