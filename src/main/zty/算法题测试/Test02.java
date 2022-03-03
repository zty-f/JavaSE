/**
 * @author: zty
 * @program: JavaSE
 * @ClassName Test02
 * @description:
 * @create: 2022-01-28 10:21
 * @Version 1.0
 **/
package main.zty.算法题测试;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

public class Test02 {
    public static void main(String[] args) {
        Test02 test02 = new Test02();
        int[][] properties = {{1,1},{5,1},{7,10},{4,1},{5,9},{6,9},{7,2},{1,10}};
        int[][] properties1 = {{1,1},{5,1},{7,10},{4,1},{5,9},{6,9},{7,2},{1,10}};
        //默认降序排列，第一列相同第二列升序   Java8新特性！lambda表达式！！！
        Arrays.sort(properties,(o1, o2)->o1[0]==o2[0]?o1[1]-o2[1]:o2[0]-o1[0]);
        //默认升序排列，第一列相同第二列降序
        Arrays.sort(properties1,(o1, o2)->o1[0]==o2[0]?o2[1]-o1[1]:o1[0]-o2[0]);
        for(int [] i:properties){
            System.out.println(i[0]+" "+i[1]);
        }
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
        for(int [] i:properties1){
            System.out.println(i[0]+" "+i[1]);
        }
    }
    public int numberOfWeakCharacters(int[][] properties) {
        TreeMap<Integer,List<Integer>> map = new TreeMap<>();
        int size = properties.length;
        for(int i = 0;i<size;i++){
            map.putIfAbsent(properties[i][0],new ArrayList<>());
            map.get(properties[i][0]).add(i);
        }
        Integer pre = map.firstKey();
        List<Integer> lp = map.get(pre);
        map.remove(pre);
        int res = 0;
        while(map.size()>0){
            Integer cur = map.firstKey();
            List<Integer> lc = map.get(cur);
            List<Integer> t = new ArrayList<>(lp);
            for(int i:lc){
                for(Integer j:t){
                    if(properties[i][1]>properties[j][1]){
                        res++;
                        lp.remove(j);
                        t = new ArrayList<>(lp);
                    }

                }
            }
            lp.addAll(lc);
            map.remove(cur);
        }
        return res;
    }
}
