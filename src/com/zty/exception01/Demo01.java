/**
 * @author: zty
 * @program: JavaSE
 * @ClassName Demo01
 * @description:
 * @create: 2022-02-01 16:34
 * @Version 1.0
 **/
package com.zty.exception01;

public class Demo01 {

    public static void main(String[] args) {

        //假设要捕获多个异常，要从小到大  Error = Exception < Throwable
        try {
            new Demo01().a();
        }catch (Exception e){
            System.out.println("程序异常！Error");
        }catch (Error e){
            System.out.println("程序异常！Exception");
        }catch (Throwable e){
            System.out.println("程序异常！Throwable");
        }finally {
            System.out.println("finally");
        }
    }


    void a(){
        b();
    }
    void b(){
        a();
    }
}
