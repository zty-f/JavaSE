/**
 * @author: zty
 * @program: JavaSE
 * @ClassName Test01
 * @description:
 * @create: 2022-01-27 10:29
 * @Version 1.0
 **/
package com.zty.算法题测试;

public class Test01 {
    public static void main(String[] args) {
        // String s = "cat and  dog   zzz";
        // String s = " o6 t";
        String s = ". ! 7hk  al6 l! aon49esj35la k3 7u2tkh  7i9y5  !jyylhppd et v- h!ogsouv 5";

        //split速度很慢，这个正则表达式还不能处理首字符就是空格的情况！还不如自己写一个split。
        /*
        int n = sentence.length();
        int l = 0, r = 0;
        int ret = 0;
        while (true) {
            while (l < n && sentence.charAt(l) == ' ') {
                l++;
            }
            if (l >= n) {
                break;
            }
            r = l + 1;
            while (r < n && sentence.charAt(r) != ' ') {
                r++;
            }
            //具体分割！
            if (valid(sentence.substring(l, r))) { // 判断根据空格分解出来的 token 是否有效
                ret++;
            }
            l = r + 1;
        }
         */
        String []ss = s.split("\\s+");//字符串通过单个空格，多个空格，tab制表符进行分割的正则表达式！
        for(String i:ss){
            System.out.println(i);
        }
        System.out.println(ss.length);

        char i='0';
        if(i>='0'&&i<='9'){
            System.out.println("OK");
        }
        System.out.println(new Test01().valid("o6"));
    }

    public boolean valid(String s){
        int l = s.length();
        for(int i=0;i<l;i++){
            if(s.charAt(0)=='-') return false;
            if(s.charAt(i)>='0'&&s.charAt(i)<='9'){
                return false;
            }
            if(i!=l-1&&(s.charAt(i)=='!'||s.charAt(i)=='.'||s.charAt(i)==',')){
                return false;
            }
            if(i+1<l&&s.charAt(i)=='-'&&(s.charAt(i+1)<'a'||s.charAt(i)>'z')){
                return false;
            }
        }
        return true;
    }
}
