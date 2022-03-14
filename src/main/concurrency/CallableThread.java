package main.concurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableThread implements Callable<Integer> {//泛型可以指定需要的类型。
    public Integer call() throws InterruptedException {
        System.out.println(Thread.currentThread().getName()+"线程执行了call方法");
        Thread.sleep(5000);
        return 1;
    }
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println(Thread.currentThread().getName()+"线程执行了main方法");
        CallableThread callableThread = new CallableThread();
        FutureTask<Integer> task = new FutureTask<Integer>(callableThread);//task调用run方法会去调用传入参数callableThread的call方法！
        Thread thread = new Thread(task);//thread调用run方法会去调用传入参数task的run方法
        thread.start();
        Integer result = task.get();//当前线程会阻塞，一直等到结果返回。
        System.out.println("执行完毕，打印result="+result);
        System.out.println("执行完毕");
    }
}
