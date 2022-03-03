package main.zty.踩坑合集; /**
 * @author: zty
 * @program: JavaSE
 * @ClassName com.zty.踩坑合集.Map
 * @description:
 * @create: 2022-01-19 19:31
 * @Version 1.0
 **/

/**
 * 尽量避免使用自定义对象作为 Map 集合 key，
 * 如果一定要使用，记得重写 hashCode 与 equals 方法。
 * 另外还要保证这是一个不可变对象，即对象创建之后，无法再修改里面字段值。
 */
public class Map {
    public static void main(String[] args) {

    }
}
/**
 * com.zty.踩坑合集.Map 接口除了支持增删改查功能以外，还有三个特有的方法，能返回所有 key，返回所有的 value，返回所有 kv 键值对。
 *
 * // 返回 key 的 set 视图
 * Set<K> keySet()；
 * // 返回所有 value   Collection 视图
 * Collection<V> values();
 * // 返回 key-value 的 set 视图
 * Set<com.zty.踩坑合集.Map.Entry<K, V>> entrySet();
 * 这三个方法创建返回新集合，底层其实都依赖的原有 com.zty.踩坑合集.Map 中数据，所以一旦 com.zty.踩坑合集.Map 中元素变动，就会同步影响返回的集合。
 *
 * 另外这三个方法返回新集合，是不支持的新增以及修改操作的，但是却支持 clear、remove 等操作。
 *
 * 使用 foreach 方式遍历新增/删除 com.zty.踩坑合集.Map 中元素，也将会和 List 集合一样，
 * 抛出 ConcurrentModificationException。
 */