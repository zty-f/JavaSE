package main.test08;

/**
 * @version V1.0
 * @ClassName: main.test08.Test06.java
 * @Copyright swpu
 * @author: zty-f
 * @date: 2022-10-01 10:47
 * @Description:
 */
public class Test06 {
    public static void main(String[] args) throws ClassNotFoundException {

        // 获取类加载器
        ClassLoader classLoader = Class.forName("main.test08.Test06").getClassLoader();
        System.out.println(classLoader);  // 启动器应用类加载器（系统类加载器） sun.misc.Launcher$AppClassLoader@18b4aac2  //自定义类加载器

        ClassLoader parent = classLoader.getParent();
        System.out.println(parent); // 扩展类加载器 sun.misc.Launcher$ExtClassLoader@677327b6

        ClassLoader parent1 = parent.getParent();
        System.out.println(parent1); // 根类加载器（bootstrap） null  //加载核心库

        ClassLoader classLoader1 = String.class.getClassLoader();
        System.out.println(classLoader1);

        // 获取系统类加载器可以加载的路径
        System.out.println(System.getProperty("java.class.path"));

    }
}
