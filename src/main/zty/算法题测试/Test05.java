/**
 * @author: zty
 * @program: JavaSE
 * @ClassName Test05
 * @description:
 * @create: 2022-02-13 10:11
 * @Version 1.0
 **/
package main.zty.算法题测试;

import java.lang.reflect.Type;

public class Test05 {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer();
        s.append(1).append(",");//可以添加整型数据
        s.append(100);
        String ss = s.toString();
        //获取数据类型！
        System.out.println(ss);
        System.out.println(ss.getClass().getName());
        StringBuffer s2 = new StringBuffer();
        s2.append(1).append(",").append("#").append(",").append("#")
                .append(2).append(",").append("#").append(",").append("#").append(",").append("#");
        System.out.println(s2);
        int index = s2.indexOf(",#,#,#");
        System.out.println(index);
        System.out.println(s2.substring(0,index));
    }
}
