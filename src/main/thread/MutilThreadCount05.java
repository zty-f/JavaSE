package main.thread;

//锁类下面的所有对象 结果正确
public class MutilThreadCount05 implements  Runnable{

    static int  sum = 0;
    @Override
    public void run() {
        synchronized (MutilThreadCount05.class){
            for (int i = 0; i < 100000; i++) {
                sum=sum+1;
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MutilThreadCount05 count = new MutilThreadCount05();
        Thread t1 = new Thread(count);
        Thread t2 = new Thread(count);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(sum);
    }
}
