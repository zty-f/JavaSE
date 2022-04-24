package main.test;

import java.util.HashMap;

/**
 * @version V1.0
 * @ClassName: main.test.Test13.java
 * @Copyright swpu
 * @author: zty-f
 * @date: 2022-04-24 15:04
 * @Description: 36进制加法
 */
public class Test13 {
    public static void main(String[] args) {
        System.out.println(add("z", "abbbb"));
    }
    static String add(String a, String b) {
        HashMap<Character,Integer> map = new HashMap<>();
        char[] tmp = new char[36];
        char t = '0';
        for (int i = 0; i <= 9; i++) {
            tmp[i] = t;
            map.put(t++,i);
        }
        t = 'a';
        for (int i = 10; i < 36; i++) {
            tmp[i] = t;
            map.put(t++,i);
        }
        char[] x,y;
        if(a.length()>b.length()){
            x = a.toCharArray();
            y = b.toCharArray();
        }else {
            y = a.toCharArray();
            x = b.toCharArray();
        }
        StringBuffer res = new StringBuffer();
            int index = y.length-1;
            int u=0,d=0,sum=0,p=0;
            int i = x.length-1;
            for (; i >= 0; i--) {
                 u = map.get(x[i]);
                 d = map.get(y[index--]);
                 sum = u+d+p;
                 p = sum/36;
                 res.append(tmp[sum%36]);
                 if(index<0) break;
            }
            if (p!=0){
                res.append(tmp[map.get(x[i-1])+1]);
            }else {
                res.append(x[i-1]);
            }
            for (int j = i-2; j >= 0; j--) {
                res.append(x[j]);
            }
        return res.reverse().toString();
    }
}
