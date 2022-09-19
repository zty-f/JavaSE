package main.test06;

import java.util.Random;
import java.util.concurrent.CountDownLatch;

/**
 * @version V1.0
 * @ClassName: main.test06.Test09.java
 * @Copyright swpu
 * @author: zty-f
 * @date: 2022-09-19 20:55
 * @Description: 多线程
 */
public class Test09 {
        public static void main(String[] args) throws InterruptedException {
            Random r = new Random();
            int count = 0;
            CountDownLatch countDownLatch = new CountDownLatch(10);
            for(int i=0;i<10;i++){
                final int time = r.nextInt(10)+1;
                count+=time;
                Thread t = new Thread(()->{
                    System.out.println("第"+Thread.currentThread().getName()+"个线程休眠："+time+"秒钟");
                    try{
                        Thread.sleep(time*1000);
                    }catch(Exception e){
                        e.printStackTrace();
                    }finally {
                        countDownLatch.countDown();
                    }
                },String.valueOf(i+1));
                t.start();
            }
            countDownLatch.await();
            System.out.println(Thread.currentThread().getName()+"线程统计到的总共休眠时间为："+count+"秒钟");
        }

        public static void test(){

        }
}
