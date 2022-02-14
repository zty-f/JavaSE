/**
 * @author: zty
 * @program: JavaSE
 * @ClassName Application
 * @description:
 * @create: 2022-02-14 16:37
 * @Version 1.0
 **/
package com.api.File;

import java.io.File;

public class Application {
    public static void main(String[] args) {
        File file = new File("D:\\IDEA_Project\\JavaSE\\src\\com\\api\\File");
        String fileName = "sea";
        //静态方法，通过类名直接调用！
        SearchFiles.searchFiles(file,fileName);
    }
}
