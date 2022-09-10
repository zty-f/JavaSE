package main.test05;

/**
 * @version V1.0
 * @ClassName: main.test05.Test10.java
 * @Copyright swpu
 * @author: zty-f
 * @date: 2022-09-10 18:36
 * @Description: try catch测试
 */
public class Test10{
    public static void main(String[] args) {
        System.out.println(test());
    }
    public static void get() throws Exception{
        throw new Exception();
    }
    public static String test(){
        try{
            get();
            System.out.println("进入··········");
            return "try";
        } catch (Exception e) {
            System.out.println("cccccc");
            return "catch";
        }finally {
            System.out.println("dddddd");
            return "final"; //这里的会覆盖上面的return
        }
    }
}
