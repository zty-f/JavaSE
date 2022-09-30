package main.test08;

import java.io.Serializable;

/**
 * @version V1.0
 * @ClassName: main.test08.Test02.java
 * @Copyright swpu
 * @author: zty-f
 * @date: 2022-09-30 14:25
 * @Description:
 */
public class Test02 implements Serializable {  //序列化接口
    public Test02(){}
    public Test02(int x){
        this(); //不止能通过new调用构造方法
    }

    static public void main(String[] args) { //public和static位置可以交换
        System.out.println("test");

        //new Thread().exit()  //不存在exit方法

        //new Calendar()  //抽象类不能实例化
    }
}

class D extends Test02{
    public  D(){
        super();
    }
}
