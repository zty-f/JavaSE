package main.zty.踩坑合集;
/**
 * @author: zty
 * @program: JavaSE
 * @ClassName com.zty.踩坑合集.ArrayList
 * @description:
 * @create: 2022-01-19 17:02
 * @Version 1.0
 **/

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/*
 * ArrayList采坑大全！
 */
public class ArrayList {
    public static void main(String[] args) {
        Integer [] array = {1,2,3,4};
        List<Integer> list = Arrays.asList(array);//仅仅只是 Arrays 一个内部类，并非真正的 java.util.com.zty.踩坑合集.ArrayList。
        // 1.通过 Arrays#asList 将数组转化为 List 集合不能进行增删操作，
        // list.add(3);//UnsupportedOperationException错误
        list.set(0,9);
        array[1]=9;
        System.out.println(Arrays.toString(array));//[9, 9, 3, 4]
        System.out.println(list);//[9, 9, 3, 4]
        // 2.通过输出结果可以看出转换前后的array和list相互影响。
        /*
         * 解耦办法
         * 1.List<String> list = new com.zty.踩坑合集.ArrayList<>(Arrays.asList(array));
         * 2.List<String> list = Lists.newArrayList(array);//谷歌提供的Guava包！
         */

        //3. List#subList 获取到的ArrayList实际上也是在原集合上进行的操作
        List<Integer> list1 = new java.util.ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        List<Integer> subList = list1.subList(0,2);
        subList.set(0,99);
        subList.add(100);//同时操作原list1
        System.out.println(list1);//[99, 2, 100, 3]
        System.out.println(subList);//[99, 2, 100]

        //4.不可变集合也可能被改变 Collections#unmodifiableList
        List<Integer> list2 = new java.util.ArrayList<>(Arrays.asList(1,2,3));
        List<Integer> unmodifiableList = Collections.unmodifiableList(list2);

        // unmodifiableList.set(0,999);//报错，不能增加，删除，修改

        //如果我对原列表list2进行操作，会发现unmodifiableList也同样发生了变化
        list2.set(0,999);
        System.out.println(unmodifiableList.get(0));//打印999，unmodifiableList发生了变化。


        // 5.foreach坑
        List<Integer> list3 = new java.util.ArrayList<>(Arrays.asList(1,2,3));

        //切记，不要随便在 foreach增加/删除元素。
       /* for(Integer i:list3){ //迭代器会出错
            if (i==1){
                list3.remove(i);//报错ConcurrentModificationException
            }
        }
        System.out.println(list3);*/
        //删除指定元素方式如下：
        /**
         * 1.removeIf+lambda表达式
         * list3.removeIf(integer -> integer==1);
         * System.out.println(list3);
         */

        //2.迭代器
        Iterator<Integer> iterator = list3.iterator();
        while(iterator.hasNext()){ //等同于上面的removeIf
            if(iterator.next()==1){
                iterator.remove();
            }
        }
        System.out.println(list3);

        //使用 Guava提供的不可变集合，jdk的比较笨重
        /**
        List<String> list4 = new java.util.com.zty.踩坑合集.ArrayList<>(Arrays.asList("one", "two", "three"));
        List<String> unmodifiableList = ImmutableList.copyOf(list);
        */

    }
}
