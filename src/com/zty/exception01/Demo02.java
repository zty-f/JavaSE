/**
 * @author: zty
 * @program: JavaSE
 * @ClassName Demo02
 * @description:
 * @create: 2022-02-01 16:41
 * @Version 1.0
 **/
package com.zty.exception01;

public class Demo02 {

    public static void main(String[] args) {

        // 使用快捷键添加代码包裹  异常/循环/判断
        // 先选中要包裹的代码 Ctrl + Alt + t
        try {
            System.out.println(1/0);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }
    }
}
