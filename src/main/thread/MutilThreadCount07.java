package main.thread;

//修饰一个方法，被修饰的方法称为同步方法，其作用的范围是整个方法，作用的对象是调用这个方法的对象。
//因为是两个不同线程对象调用  所以结果还是不正确
public class MutilThreadCount07 implements  Runnable{

    static int  sum = 0;
    @Override
    public void run() {
        synchronized (this){
            for (int i = 0; i < 100000; i++) {
                sum=sum+1;
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MutilThreadCount07 count1 = new MutilThreadCount07();
        MutilThreadCount07 count2 = new MutilThreadCount07();

        Thread t1 = new Thread(count1);
        Thread t2 = new Thread(count2);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(sum);
    }
}
