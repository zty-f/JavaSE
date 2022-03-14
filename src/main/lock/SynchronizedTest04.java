package main.lock;
/**
 * @ClassName: main.lock.SynchronizedTest04.java
 * @Copyright swpu
 * @author: zty-f
 * @date:  2022-03-14 21:05
 * @version V1.0
 * @Description:  .作用于静态方法时：锁住的是Class对象
 */
public class SynchronizedTest04 {

  public static void main(String[] args) {
    //
    final SynchronizedTest04 synchronizedTest04 =new SynchronizedTest04();
     final SynchronizedTest04 synchronizedTest042 =new SynchronizedTest04();
    new Thread(new Runnable() {
      @Override
      public void run() {
        synchronizedTest04.generalMethod1();
      }
    }).start();

    new Thread(new Runnable() {
      @Override
      public void run() {
        synchronizedTest042.generalMethod2();
      }
    }).start();
  }

  public static synchronized void generalMethod1(){//synchronized作用于静态方法，锁住的是当前Class对象
    for (int i=1;i<3;i++){
      System.out.println("generalM1 execute "+i+" time");
    }
  }

  public static  synchronized void generalMethod2(){//synchronized作用于静态方法，锁住的是当前Class对象
    for (int i=1;i<3;i++){
      System.out.println("generalM2 execute "+i+" time");
    }
  }

}