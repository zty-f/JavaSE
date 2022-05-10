package main.test02;

/**
 * @version V1.0
 * @ClassName: main.test02.Test10.java
 * @Copyright swpu
 * @author: zty-f
 * @date: 2022-05-10 16:29
 * @Description: 访问权限测试
 */
public class Test10 { //类只能使用public和default修饰

    //!!!!!!注意！！！！！！！！！！default不是修饰符，不能加在类前面。

    //成员内部类只能使用 public private protected修饰,也可以不修饰默认为default
    public class inner{

    }

    private class inner1{

    }

    protected class inner2{

    }

    class inner3{

    }

    public void test(){

        //局部内部类只能使用final修饰  也可以不修饰默认为default
        final class a{

        }
        class  b{

        }
    }


}
