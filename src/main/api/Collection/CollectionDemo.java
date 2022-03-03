package main.api.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo {
    public static void main(String[] args) {
        Collection<String> lists = new ArrayList<>();
        lists.add("aa");
        lists.add("bb");
        lists.add("cc");
        System.out.println(lists); // lists = [aa, bb, cc]
		//迭代器流程
        // 1.得到集合的迭代器对象。
        Iterator<String> it = lists.iterator();
        // 2.使用while循环遍历。
        while(it.hasNext()){
            String ele = it.next();
            System.out.println(ele);
        }
        System.out.println("++++++++++++++++");
        
		//增强for
        for (String ele : lists) {
            System.out.println(ele);
        }
        System.out.println("++++++++++++++++");
        //lambda表达式
        lists.forEach(s -> {
            System.out.println(s);
        });
    }
}