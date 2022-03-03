/**
 * @author: zty
 * @program: JavaSE
 * @ClassName Demo02
 * @description:
 * @create: 2022-02-13 20:39
 * @Version 1.0
 **/
package main.api.Stream;

import java.util.*;
import java.util.stream.Stream;

//获取流的几种方式
public class Demo02 {
    public static void main(String[] args) {
        // Collection集合获取Stream流。
        Collection<String> c = new ArrayList<>();
        Stream<String> listStream = c.stream();

        HashMap<String, Integer> map = new HashMap<>();
        // Map集合获取流
     // 先获取键的Stream流。
        Stream<String> keysStream = map.keySet().stream();
     // 在获取值的Stream流
        Stream<Integer> valuesStream = map.values().stream();
     // 获取键值对的Stream流（key=value： Map.Entry<String,Integer>）
        Stream<Map.Entry<String,Integer>> keyAndValues = map.entrySet().stream();

     //数组获取流
        String[] arr = new String[]{"Java", "JavaEE" ,"Spring Boot"};
        Stream<String> arrStream1 = Arrays.stream(arr);
        Stream<String> arrStream2 = Stream.of(arr);
    }
}
