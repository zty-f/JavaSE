/**
 * @author: zty
 * @program: JavaSE
 * @ClassName Traversal
 * @description:
 * @create: 2022-02-10 16:09
 * @Version 1.0
 **/
package main.api.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//Map遍历的三种方式
public class Traversal {//遍历
    public static void main(String[] args){
        Map<String , Integer> maps = new HashMap<>();
        maps.put("a",1);
        maps.put("b",2);
        maps.put("c",3);
        //(1)键找值
        System.out.println("键找值:");
        Set<String> keys = maps.keySet();
        for(String key : keys) {
            System.out.println(key + "=" + maps.get(key));
        }
        //Iterator<String> iterator = hm.keySet().iterator();

        //(2)键值对
        //(2.1)普通方式
        System.out.println("entrySet:");
        Set<Map.Entry<String,Integer>> entries = maps.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + "=>" + entry.getValue());
        }
        //(2.2)迭代器方式
        System.out.println("迭代器:");
        Iterator<Map.Entry<String, Integer>> iterator = maps.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println(entry.getKey() + "=" + entry.getValue());

        }
        //(3)Lambda
        System.out.println("Lambda表达式:");
        maps.forEach((k,v) -> {
            System.out.println(k + "==>" + v);
        });
    }
}
