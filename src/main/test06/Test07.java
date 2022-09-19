package main.test06;

/**
 * @version V1.0
 * @ClassName: main.test06.Test07.java
 * @Copyright swpu
 * @author: zty-f
 * @date: 2022-09-19 20:25
 * @Description: 多线程
 */
public class Test07 extends Thread{

    //@Override
    //public synchronized void start() {//继承Thread类不需要强制重写run方法，不会编译报错，不像接口
    //    super.start();
    //    System.out.println();
    //}

    @Override
    public void run(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("子线程");
    }

    public static void main(String[] args){
        Test07 test07 = new Test07();
        test07.start();//线程启动的方法！！！！！！！
        System.out.println("Main");
    }
}
