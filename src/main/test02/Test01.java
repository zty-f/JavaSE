package main.test02;

/**
 * @version V1.0
 * @ClassName: main.test02.Test01.java
 * @Copyright swpu
 * @author: zty-f
 * @date: 2022-05-03 16:30
 * @Description: 构造方法测试
 */
public class Test01 {

    final int x = 0; //可以通过直接初始化赋值，也可以通过构造器注入
    final int y;
    public  Test01(int y){
        //构造方法不能使用 final static synchronized native修饰
        this.y = y;
    }

    final void a(){

    }
    void a(int x){

    }
}
class implement{ //implement可以作为类名和方法名  implements default throw throws等等都不可以
    public void implement(){
        String s;//局部变量不使用可以不用初始化
        System.out.println(1);
        //System.out.println(s);//要使用就必须初始化 否则编译不通过
    }
}