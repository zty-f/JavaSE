/**
 * @author: zty
 * @program: JavaSE
 * @ClassName Outer
 * @description:
 * @create: 2022-02-01 15:57
 * @Version 1.0
 **/
package main.zty.oop08;

public class Outer {

    private int id;
    private void out(){
        System.out.println("这是外部类方法！");
    }

    //局部内部类
    public void method(){
        class Inner{
            public void in(){
                System.out.println("这是局部内部类方法！");
            }
        }
    }



    //成员内部类
    public class Inner{
        public void in(){
            System.out.println("这是成员内部类方法！");
        }

        public void getOuterId(){
            System.out.println("外部类id："+id);
        }
    }

}
