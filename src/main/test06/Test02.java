package main.test06;

/**
 * @version V1.0
 * @ClassName: main.test06.Test02.java
 * @Copyright swpu
 * @author: zty-f
 * @date: 2022-09-13 22:18
 * @Description:
 */
class Super{
    protected int count;

    public Super(){
        grow();//调用的是子类的方法
    }

    public void grow(){
        count++;
    }
}

class Sub extends Super{
    public Sub(){
        grow();
        count++;
    }
    public void grow(){
        count+=2;
    }
}
public class Test02 {
    public static void main(String[] args) {
        Sub sub = new Sub();
        System.out.println(sub.count);
    }
}
