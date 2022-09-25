package main.test07;

/**
 * @version V1.0
 * @ClassName: main.test07.Test07.java
 * @Copyright swpu
 * @author: zty-f
 * @date: 2022-09-25 21:02
 * @Description: 查找最后一个x
 */
public class Test07 {
    public static void main(String[] args) {
        binarySearch(new int[]{4},4);
    }

    public static void binarySearch(int[] vec,int x){
        int l = 0,r = vec.length;
        while(l<r){
            int mid = (l+r)>>1;
            if(vec[mid]<=x){
                l = mid+1;
            }else{
                r = mid;
            }
        }
        System.out.println(l);
        System.out.println(r);
        System.out.println(l-1);
    }
}
