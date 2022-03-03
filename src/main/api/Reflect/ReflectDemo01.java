/**
 * @author: zty
 * @program: JavaSE
 * @ClassName ReflectDemo01
 * @description:
 * @create: 2022-02-16 15:50
 * @Version 1.0
 **/
package main.api.Reflect;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

//暴力攻击
public class ReflectDemo01 {
    public static void main(String[] args) throws Exception {
        //泛型只能工作在编译阶段，运行阶段泛型就消失了，反射工作在运行时阶段
        List<Double> scores = new ArrayList<>();
        scores.add(99.3);
        scores.add(199.3);
        scores.add(89.5);
        // 拓展：通过反射暴力的注入一个其他类型的数据进去。
        // a.先得到集合对象的Class文件对象
        Class c = scores.getClass();
        // b.从ArrayList的Class对象中定位add方法
        Method add = c.getDeclaredMethod("add", Object.class);
        // c.触发scores集合对象中的add执行（运行阶段，泛型不能约束了）
        add.invoke(scores,"波仔");
        System.out.println(scores);
    }
}
