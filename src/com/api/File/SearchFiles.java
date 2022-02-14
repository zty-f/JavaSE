/**
 * @author: zty
 * @program: JavaSE
 * @ClassName SearchFiles
 * @description:
 * @create: 2022-02-14 16:35
 * @Version 1.0
 **/
package com.api.File;

import java.io.File;
import java.io.IOException;

public class SearchFiles {
    /**
     * 去某个目录下搜索某个文件
     * @param dir 搜索文件的目录。
     * @param fileName 搜索文件的名称。
     */
    public static void searchFiles(File dir , String fileName){
        // 1.判断是否存在该路径，是否是文件夹
        if(dir.exists() && dir.isDirectory()){
            // 2.提取当前目录下的全部一级文件对象
            File[] files = dir.listFiles();// 可能是null/也可能是空集合[]
            // 3.判断是否存在一级文件对象,判断是否不为空目录
            if(files != null && files.length > 0){
                // 4.判断一级文件对象
                for(File file : files){
                    // 5.判断file是文件还是文件夹
                    if(file.isFile()){
                        // 6.判断该文件是否为我要找的文件对象
                        if(file.getName().contains(fileName)){//模糊查找
                            System.out.println((file.getAbsolutePath()));
                            try {
                                // 启动它（拓展）
                                //Runtime r = Runtime.getRuntime();
                                //r.exec(file.getAbsolutePath());
                                System.out.println(file.getName());
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    } else {
                        // 7.该文件是文件夹，文件夹要递归进入继续寻找
                        searchFiles(file,fileName);
                    }
                }
            }
        }
    }
}
