package main.zty.常用数据结构总结;

import java.util.*;

/**
 * @version V1.0
 * @Copyright swpu
 * @author: zty-f
 * @date: 2022/3/13 16:31
 * @Description:
 */
public class ArrayListStudy {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        //1.添加一个元素
        list1.add(1);
        Integer[] tmp = new Integer[]{2,3,4,5,6};
        //2.添加多个元素
        Collections.addAll(list1,tmp);
        System.out.println(list1);//[1, 2, 3, 4, 5, 6]
        List<Integer> list2 = list1;
        //3.把list2的全部数据加在list1后面
        list1.addAll(list2);
        System.out.println(list1);//[1, 2, 3, 4, 5, 6, 1, 2, 3, 4, 5, 6]
        //因为list2和list1指向同一个内存地址，所以修改的是同一个
        System.out.println(list2);//[1, 2, 3, 4, 5, 6, 1, 2, 3, 4, 5, 6]
        //4.获取集合元素个数
        System.out.println(list1.size());//12
        //5.获取某个位置的元素
        System.out.println(list1.get(1));//2
        //6.是否包含某个元素
        System.out.println(list1.contains(1));//true
        //7.删除指定位置元素，返回元素值
        System.out.println(list1.remove(1));//2
        //8.删除指定元素
        System.out.println(list1.remove(new Integer(1)));//true

        System.out.println(list1);//[3, 4, 5, 6, 1, 2, 3, 4, 5, 6]
        //9.查找指定元素在集合中的位置
        System.out.println(list1.indexOf(new Integer(5)));//2
        //10.将指定位置元素修改,返回当前位置修改前的值
        System.out.println(list1.set(1,99));//4

        // 快速创建并初始化一个List集合
        // 11.该集合对象类型为Arrays类的内部类ArrayList
        List<String> list3 = Arrays.asList("str1", "str2", "str3", "str4", "str5", "str6");
        Object[] array01 = list3.toArray(); //转换成Object数组
        String[] array02 = list3.toArray(new String[0]); // 转换成String类型数组

        //12.截取子集合，开始到结束（不包含）
        System.out.println(list1.subList(0,3));//[3, 99, 5]

        //13.排序
        list1.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;//升序  ！字符串类型使用o1.compareTo(o2)进行比较大小
            }
        });
        System.out.println(list1);//[1, 2, 3, 3, 4, 5, 5, 6, 6, 99]
        //lambda表达式
        list1.sort((a,b)->b-a);//降序
        System.out.println(list1);//[99, 6, 6, 5, 5, 4, 3, 3, 2, 1]

        //14.遍历
        List<String> list4 = Arrays.asList("str1", "str2", "str3", "str4", "str5", "str6");
        // 方式1：使用for循环遍历集合list
        for (int i = 0, len = list4.size(); i < len; i++) {
            System.out.print(list4.get(i)+",");//str1,str2,str3,str4,str5,str6
        }

        // 方式2：使用迭代器遍历集合list
        // (1)获取当前集合对象的迭代器对象
        Iterator<String> it = list4.iterator();
        // (2)使用迭代器遍历每个元素
        while (it.hasNext()) {  //判断集合是否有下一个元素
            System.out.print(it.next()+",");//获取集合的下一个元素 str1,str2,str3,str4,str5,str6
        }

        // 方式3 : foreach遍历list
        for(String str : list4) {
            System.out.print(str + ","); //str1,str2,str3,str4,str5,str6
        }

        /*
        注意：在使用迭代器遍历集合的过程中删除元素可能会造成fail-fast错误，可以使用迭代器的remove()方法避免错误
         */
    }
}
