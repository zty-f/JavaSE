package main.lock;
/**
 * @ClassName: main.lock.SynchronizedTest05.java
 * @Copyright swpu
 * @author: zty-f
 * @date:  2022-03-14 21:06
 * @version V1.0
 * @Description:  作用于代码块时：锁住的是所有代码块中配置的对象
 */
public class SynchronizedTest05 {
  String lockA="lockA";

  public static void main(String[] args) {
    final SynchronizedTest05 synchronizedDemo=new SynchronizedTest05();
    new Thread(new Runnable() {
      @Override
      public void run() {
        synchronizedDemo.blockMethod1();
      }
    }).start();

    new Thread(new Runnable() {
      @Override
      public void run() {
        synchronizedDemo.blockMethod2();
      }
    }).start();
  }
  public  void blockMethod1(){//synchronized作用于代码块，锁住的是所有代码块中配置的对象
    synchronized (lockA) {
      for (int i = 1; i < 3; i++) {
        System.out.println("blockMethod1 execute " + i + " time");
      }
    }
  }
  public  void blockMethod2(){//synchronized作用于普通的方法，锁住的是所有代码块中配置的对象
    synchronized (lockA) {
      for (int i = 1; i < 3; i++) {
        System.out.println("blockMethod2 execute " + i + " time");
      }
    }
  }

}