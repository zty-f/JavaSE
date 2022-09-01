package main.test04;

/**
 * @version V1.0
 * @ClassName: main.test04.Test07.java
 * @Copyright swpu
 * @author: zty-f
 * @date: 2022-09-01 21:12
 * @Description: 抽象类测试
 */
public abstract class Test07 {
    private int x;
    private int y;
    public abstract void draw();

    public void set(int x,int y){
        this.x = x;
        this.y = y;
    }
}

abstract class B extends Test07{
    private int r;
    //public void draw(); 报错：普通方法必须有方法体、

    // 抽象类也可以重写继承的抽象类的方法！！！！
    public void draw(){

    }
}

class E extends Test07{
    private int r;

    //public void draw(); 报错：普通类继承抽象类必须重写所有方法！！！！

    // 正确写法
    @Override
    public void draw() {

    }
}