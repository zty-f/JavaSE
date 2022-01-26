/**
 * @author: zty
 * @program: JavaSE
 * @ClassName Demo04
 * @description:
 * @create: 2022-01-26 20:11
 * @Version 1.0
 **/
package 基础语法;

public class Demo04 {
    public static void main(String[] args) {
        // 操作比较大的数的时候，注意溢出问题
        // JDK7新特性，数字之间可以用下划线_分割
        int money = 10_0000_0000;
        System.out.println(money); // 1000000000

        int year = 20;
        int total = money*year;
        System.out.println(total); // -1474836480 内存溢出

        long total1 = money*year;
        System.out.println(total1);//-1474836480  默认是int，转换之前就已经出问题！

        long total2 = money*(long)year; // 先把一个数的精度提高，计算时按照高的来！
        System.out.println(total2);  // 20000000000 没问题！

        //两个都是定义Long类型，为了和1做区别，最好规范使用L！
        long l = 1l;
        long l1 = 1L;
        System.out.println(l);
        System.out.println(l1);
    }
}
