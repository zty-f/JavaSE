/**
 * @author: zty
 * @program: JavaSE
 * @ClassName Test07
 * @description:
 * @create: 2022-02-17 09:50
 * @Version 1.0
 **/
package main.zty.算法题测试;

public class Test07 {
    public static void main(String[] args) {
        permutation(new int[]{1,2,3,4},0,3);
    }

    public static void permutation(int[] c , int begin , int end){
        if(begin == end){
            for(int i = 0 ; i < c.length ; i++){
                System.out.print(c[i]);
            }
            System.out.println();
        }else{
            int temp;
            for(int i = begin ; i <= end ; i++){
                temp = c[begin];
                c[begin] = c[i];
                c[i] = temp;

                permutation(c , begin + 1 , end);

                temp = c[begin];
                c[begin] = c[i];
                c[i] = temp;
            }
        }
    }

}
