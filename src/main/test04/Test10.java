package main.test04;

/**
 * @version V1.0
 * @ClassName: main.test04.Test10.java
 * @Copyright swpu
 * @author: zty-f
 * @date: 2022-09-04 20:56
 * @Description:
 */
class N{
    static {
        name = "AAAA";// 编译期间确定
    }
    {
        name = "BBBB";// 运行期间确定
    }

    private static String name;

    public static void main(String[] args) {
        System.out.println(N.name); // 输出 AAAA
        System.out.println(new N().name); // 输出 BBBB
    }
}

