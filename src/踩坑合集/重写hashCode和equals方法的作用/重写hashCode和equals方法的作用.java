package 踩坑合集.重写hashCode和equals方法的作用;

import java.util.HashMap;
import java.util.Objects;

/**
 * @author: zty
 * @program: JavaSE
 * @ClassName Override_hashCode_equals
 * @description:
 * @create: 2022-01-19 16:00
 * @Version 1.0
 **/

class  Key{
    private Integer id;

    public Key(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Key that = (Key) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
class Test{
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
