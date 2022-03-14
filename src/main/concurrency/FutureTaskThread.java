package main.concurrency;

import java.util.concurrent.*;

/**
 * @version V1.0
 * @Copyright swpu
 * @author: zty-f
 * @date: 2022/3/14 20:17
 * @Description: Runnable实现类的实例可以作为Thread的入参使用，而Callable只能使用FutureTask进行封装使用。
 */
public class FutureTaskThread {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //Callable使用FutureTask封装后，配合线程池进行使用
        ExecutorService pool = Executors.newSingleThreadExecutor();
        FutureTask task = new FutureTask(new Callable() {
            @Override
            public String call() throws Exception {
                //任务的代码
                System.out.println("Callable线程········");
                return "Callable结果返回";
            }
        });
        pool.submit(task);
        //Runnable使用FutureTask封装后，配合线程池进行使用
        FutureTask task1 = new FutureTask(new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable线程········");
            }
        },"Runnable结果返回");
        pool.submit(task1);
        System.out.println(task.get());
        System.out.println(task1.get());
    }
}
