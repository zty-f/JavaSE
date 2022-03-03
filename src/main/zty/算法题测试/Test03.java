/**
 * @author: zty
 * @program: JavaSE
 * @ClassName Test03
 * @description:
 * @create: 2022-01-28 10:59
 * @Version 1.0
 **/
package main.zty.算法题测试;

import java.util.ArrayList;

public class Test03 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        ArrayList<Integer> list1 = new ArrayList<>();//可以添加重复元素！
        list1.add(1);
        list1.add(1);
        list1.add(2);
        list.addAll(list1);
        list.remove(1);
        //list.remove((Integer) 1); //要删除指定元素要使用引用型类型！
        list.remove((Integer) 2);//默认删除第一个2
        list.remove((Integer) 2);
        System.out.println(list);

    }
}
