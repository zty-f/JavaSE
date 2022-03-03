/**
 * @author: zty
 * @program: JavaSE
 * @ClassName Test
 * @description:
 * @create: 2022-01-27 15:46
 * @Version 1.0
 **/
package main.zty.踩坑合集.重写hashCode和equals方法的作用;

import java.util.HashMap;

public class Test{
    public static void main(String[] args) {
        /**
         * 在HashMap的 “键” 部分存放自定义的对象，
         * 一定要在这个对象里用自己的 equals和 hashCode
         * 方法来覆盖 Object里的同名方法。
         */
        HashMap<Key, String> map = new HashMap<>();
        Key k1 = new Key(1);
        Key k2 = new Key(1);
        map.put(k1,"k1....");
        System.out.println(map.get(k2));//这里要是没有重写hashCode和equals方法就不能通过k2获取map里面的键值对。
    }
}
