package main.zty.算法题测试;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

//数组全排列方法1
public class Test11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        helper(array,0);
    }
    public static void helper(int[] array,int index){
        if(index==array.length-1)
        {
            System.out.println(Arrays.toString(array));
            List<Integer> list3 = Arrays.stream( array ).boxed().collect(Collectors.toList());
            //如果已经到了数组的最后一个元素，前面的元素已经排好，输出。
        }
        for(int i=index;i<array.length;i++)
        {
            //把第一个元素分别与后面的元素进行交换，递归的调用其子数组进行排序
            Swap(array,i,index);
            helper(array,index+1);
            //子数组排序返回后要将第一个元素交换回来。
            //如果不交换回来会出错，比如说第一次1、2交换，第一个位置为2，子数组排序返回后如果不将1、2
            //交换回来第二次交换的时候就会将2、3交换，因此必须将1、2交换使1还是在第一个位置
            Swap(array,i,index);
        }

    }
    public static void Swap(int chs[],int i,int j)
    {
        int temp;
        temp=chs[i];
        chs[i]=chs[j];
        chs[j]=temp;
    }
}
