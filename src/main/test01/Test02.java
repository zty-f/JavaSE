package main.test01;

/**
 * @version V1.0
 * @Copyright swpu
 * @author: zty-f
 * @date: 2022/3/16 16:41
 * @Description:    赋值语句准确性
 */
/*
        高转低，强制！
        低转高，自动！
 */
public class Test02 {
    public static void main(String[] args) {
        long t1 = 012;//0开头表示8进制
        long t2 = 0012;
        float f = -142;
        //float d = 14.2; 编译错误 //小数不加F默认是double类型，double类型不会自动转成float类型，编译是通不过的，但将整数赋予float是可以的。
        //int t3 = (int)true;  错误！不能把boolean类型转换成int
        double t4 = 0x12345678;  //0x开头表示16进制
        //byte t5 = 128;  错误！ byte的范围-128~127，128超过范围
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(f);
        System.out.println(t4);
    }
}
