package main.lock;
/**
 * @ClassName: main.lock.SynchronizedTest06.java
 * @Copyright swpu
 * @author: zty-f
 * @date:  2022-03-14 21:07
 * @version V1.0
 * @Description: 作用于成员变量和非静态方法时：锁住的是对象实例，即this对象!!!!!
 */
public class SynchronizedTest06 {
  public static void main(String[] args) {
    //
    final SynchronizedTest06 synchronizedTest06 =new SynchronizedTest06();
    final SynchronizedTest06 synchronizedTest07 =new SynchronizedTest06();
    new Thread(new Runnable() {
      @Override
      public void run() {
        try {
          synchronizedTest06.generalMethod1();
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    }).start();
    new Thread(new Runnable() {
      @Override
      public void run() {
        try {
          synchronizedTest06.generalMethod2();
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    }).start();
  }

  public synchronized void generalMethod1() throws InterruptedException {//synchronized作用于普通的方法，锁住的是当前实例对象
    for (int i=1;i<3;i++){
      Thread.sleep(1000);
      System.out.println("generalM1 execute "+i+" time");
    }
  }

  public synchronized void generalMethod2() throws InterruptedException {//synchronized作用于普通的方法，锁住的是当前实例对象
    for (int i=1;i<3;i++){
      Thread.sleep(1000);
      System.out.println("generalM2 execute "+i+" time");
    }
  }

}
