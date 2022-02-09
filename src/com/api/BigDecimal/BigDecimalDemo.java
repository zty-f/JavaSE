package com.api.BigDecimal;

/*
总结
    1.BigDecimal 是用来进行精确计算的
    2.创建 BigDecimal 的对象，构造方法使用参数类型为字符串的。
    3.四则运算中的除法，如果除不尽请使用 divide 的三个参数的方法。
BigDecimal divide = bd1.divide(参与运算的对象,小数点后精确到多少位,舍入模式);
参数1：表示参与运算的BigDecimal 对象。
参数2：表示小数点后面精确到多少位
参数3：舍入模式
  BigDecimal.ROUND_UP  进一法
  BigDecimal.ROUND_FLOOR 去尾法
  BigDecimal.ROUND_HALF_UP 四舍五入
 */

import com.zty.oop03.B;

import java.math.BigDecimal;

public class BigDecimalDemo {
    public static void main(String[] args) {
        // 浮点型运算的时候直接+ - * / 可能会出现数据失真（精度问题）。
        System.out.println(0.1 + 0.2);
        System.out.println(1.301 / 100);
        
        double a = 0.1 ;
        double b = 0.2 ;
        double c = a + b ;
        System.out.println(c);//0.30000000000000004
        
        // 1.把浮点数转换成大数据对象运算
        BigDecimal a1 = BigDecimal.valueOf(a);
        BigDecimal b1 = BigDecimal.valueOf(b);
        BigDecimal b2 = BigDecimal.valueOf(1.301);
        BigDecimal c1 = a1.add(b1);//a1.divide(b1);也可以
		System.out.println(c1);//0.3

        // BigDecimal只是解决精度问题的手段，double数据才是我们的目的！！
        BigDecimal x = b2.divide(BigDecimal.valueOf(100));
        System.out.println(x);//0.01301
        double d = c1.doubleValue();
        System.out.println(d);//0.3
        System.out.println(x.doubleValue());//0.01301

        // 3.四则运算中的除法，如果除不尽请使用 divide 的三个参数的方法。
        BigDecimal m = BigDecimal.valueOf(1);
        BigDecimal n = BigDecimal.valueOf(3);

        BigDecimal res = m.divide(n, 3, BigDecimal.ROUND_HALF_UP);

        System.out.println(res);//0.333

    }
}