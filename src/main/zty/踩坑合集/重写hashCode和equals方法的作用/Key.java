/**
 * @author: zty
 * @program: JavaSE
 * @ClassName Key
 * @description:
 * @create: 2022-01-27 15:46
 * @Version 1.0
 **/
package main.zty.踩坑合集.重写hashCode和equals方法的作用;

import java.util.Objects;

/**
 * @author: zty
 * @program: JavaSE
 * @ClassName Override_hashCode_equals
 * @description:
 * @create: 2022-01-19 16:00
 * @Version 1.0
 **/

public class  Key{
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
