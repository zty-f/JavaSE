/**
 * @author: zty
 * @program: JavaSE
 * @ClassName SparseArray
 * @description:
 * @create: 2022-01-28 20:09
 * @Version 1.0
 **/
package main.zty.array;

import java.util.Arrays;

//稀疏数组
public class SparseArray {
    public static void main(String[] args) {
        // 先创建一个二维数组
        int[][] x = new int[8][8];
        x[1][2]=1;
        x[4][7]=2;
        x[7][2]=2;
        //输出该二维数组   发现：大多数元素都是0，只有三个有效数据
        /*
        0	0	0	0	0	0	0	0
        0	0	1	0	0	0	0	0
        0	0	0	0	0	0	0	0
        0	0	0	0	0	0	0	0
        0	0	0	0	0	0	0	2
        0	0	0	0	0	0	0	0
        0	0	0	0	0	0	0	0
        0	0	2	0	0	0	0	0
         */
        System.out.println("输出原二维数组：");
        for(int i[]:x){
            for (int j:i){
                System.out.print(j+"\t");
            }
            System.out.println();
        }

        //统计有效数据
        int sum = 0;
        for(int i[]:x){
            for (int j:i){
                if (j!=0)
                    sum++;
            }
        }

        System.out.println("==============================================================");

        System.out.println("该数值的有效数据个数为："+sum);

        //转换为稀疏矩阵
         //1.创建稀疏矩阵
        int[][] sparse = new int[sum+1][3];

        sparse[0][0] = x.length;
        sparse[0][1] = x[0].length;
        sparse[0][2] = sum;

        // 遍历二维数组，把有效数据加入稀疏数组
        int ii = 1;
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[0].length; j++) {
                if(x[i][j]!=0){
                    sparse[ii][0] = i;
                    sparse[ii][1] = j;
                    sparse[ii][2] = x[i][j];
                    ii++;
                }
            }
        }
        System.out.println("打印稀疏数组：");
        for(int i[]:sparse){
            for (int j:i){
                System.out.print(j+"\t");
            }
            System.out.println();
        }

        System.out.println("=================================================");
        System.out.println("还原稀疏数组为二维数组：");

        int [][] y = new int[sparse[0][0]][sparse[0][1]];
        for (int i = 1; i < sparse.length; i++) {
            y[sparse[i][0]][sparse[i][1]] = sparse[i][2];
        }

        System.out.println("打印还原后的二维数组：");
        for(int i[]:y){
            for (int j:i){
                System.out.print(j+"\t");
            }
            System.out.println();
        }


    }
}
