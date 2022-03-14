package main.concurrency;
/**
 * @ClassName: main.concurrency.RunnableThread.java
 * @Copyright swpu
 * @author: zty-f
 * @date:  2022-03-14 19:59
 * @version V1.0
 * @Description: 实现Runnable接口，也可以使用匿名内部类的方式来实现（可以使用lambda表达式简化）
 */
public class RunnableThread01 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName()+"线程执行了main方法");
        //1.原始写法
        //Thread thread = new Thread(new Runnable() {
        //    @Override
        //    public void run() {
        //        System.out.println(Thread.currentThread().getName()+"线程执行了run方法");
        //    }
        //});
        //2.Java8 lambda表达式简化上述方式
        Thread thread = new Thread(()->{
            System.out.println(Thread.currentThread().getName()+"线程执行了run方法");
        });
        thread.start();
    }
}
