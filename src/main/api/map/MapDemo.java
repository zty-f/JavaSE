package main.api.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
public V put(K key, V value)：把指定的键与值添加到 Map 集合中，重复的键会覆盖前面的值元素
public V remove(Object key)：把指定的键对应的键值对元素在集合中删除，返回被删除元素的值
public V get(Object key)：根据指定的键，在 Map 集合中获取对应的值
public Set<K> keySet()：获取 Map 集合中所有的键，存储到 Set 集合中
public Collection<V> values()：获取全部值的集合，存储到 Collection 集合
public Set<Map.Entry<K,V>> entrySet()：获取Map集合中所有的键值对对象的集合
public boolean containsKey(Object key)：判断该集合中是否有此键
 */

public class MapDemo {
    public static void main(String[] args) {
        Map<String , Integer> maps = new HashMap<>();
        maps.put("a",1);
        maps.put("b",2);
        maps.put("c",3);
        System.out.println(maps.isEmpty());//false
        Integer value = maps.get("b");//返回键值对象
        Set<String> keys = maps.keySet();//获取Map集合中所有的键，
        //Map集合的键是无序不重复的，所以返回的是一个Set集合
        System.out.println(keys);
        Collection<Integer> values = maps.values();
        //Map集合的值是不做要求的，可能重复，所以值要用Collection集合接收!
        System.out.println(values);

        //获取Map集合中所有的键值对对象的集合
        Set<Map.Entry<String, Integer>> entrySet = maps.entrySet();
        System.out.println(entrySet);
    }
}