package main.test02;

/**
 * @version V1.0
 * @ClassName: main.test02.Test07.java
 * @Copyright swpu
 * @author: zty-f
 * @date: 2022-05-09 10:38
 * @Description: Boolean测试
 */
/*
Statement 每次执行sql语句，数据库都要执行sql语句的编译 ，最好用于仅执行一次查询并返回结果的情形，效率高于PreparedStatement.
PreparedStatement是预编译的，使用PreparedStatement有几个好处
 a. 在执行可变参数的一条SQL时，PreparedStatement比Statement的效率高，因为DBMS预编译一条SQL当然会比多次编译一条SQL的效率要高。
 b. 安全性好，有效防止Sql注入等问题。
 c.  对于多次重复执行的语句，使用PreparedStament效率会更高一点，并且在这种情况下也比较适合使用batch；
 d.  代码的可读性和可维护性。
CallableStatement接口扩展 PreparedStatement，用来调用存储过程,它提供了对输出和输入/输出参数的支持。CallableStatement
    接口还具有对 PreparedStatement 接口提供的输入参数的支持。
 */
public class Test07 {
    public static void main(String[] args) {
        Boolean f = false;
        // 只有boolean变量可以在if语句中使用 = ，相当于先赋值，再判断
        if(f = true){  //编译后转化为  if (Boolean.valueOf(true))
            System.out.println("true");
        }else{
            System.out.println("false");
        }
        //最终输出true

        //上述代码编译生成代码如下：
        /*public static void main(String[] args) {
            Boolean f = false;
            if (Boolean.valueOf(true)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }

        }*/
    }
}
