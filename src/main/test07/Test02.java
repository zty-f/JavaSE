package main.test07;

/**
 * @version V1.0
 * @ClassName: main.test07.Test02.java
 * @Copyright swpu
 * @author: zty-f
 * @date: 2022-09-20 18:03
 * @Description:
 */
interface I{
     void test();
}

//public class Test02 implements I{   //普通类继承接口必须实现接口中的方法
//    public Test02(){
//
//    }
//}

abstract class T implements I{ // 抽象类实现接口可以不用实现方法
  abstract void a();
}

//class C extends T{  //必须实现T未实现的所有方法
//
//
//}