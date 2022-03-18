package main.test;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * @version V1.0
 * @Copyright swpu
 * @author: zty-f
 * @date: 2022/3/15 14:41
 * @Description:  final测试
 *          final修饰的类叫最终类，修饰方法叫最终方法
 */
/*
final的作用：
    1. 修饰变量，使用final修饰基本类型的变量，一旦对该变量赋值之后，就不能重新赋值了。
       但是对于引用类型变量，他保存的只是引用，final只能保证引用类型变量所引用的地址不改变，但不保证这个对象不改变，这个对象完全可以发生改变。(通过反射)
    2. 修饰方法，方法不可被重写，但是还是可以重载
    3. 修饰类，类不可继承。
 */
public final class Test01 {

    public static void main(String[] args) throws UnsupportedEncodingException {
        //GBK字节流转UTF-8
        byte []src = new byte[8],res;
        res = new String(src,"GBK").getBytes("UTF-8");
        System.out.println(res);

        //数组比较
        int[] a = new int[]{1,2,3};
        int[] b = new int[]{1,2,3};
        System.out.println(a.equals(b));//false  继承父类的equals方法，并没有重写，相当于使用==，比较的是引用地址
        System.out.println(Arrays.equals(a,b)); //true  重写了equals方法，逐个元素进行比较

    }
    //final修饰方法可以重载，不能重写
    final void say(){

    }
    final void say(int a){

    }
}
