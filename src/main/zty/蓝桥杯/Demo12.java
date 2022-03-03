package main.zty.蓝桥杯;

import java.util.Scanner;

//求一个字符串中Alice Bob出现的次数
//Alice和Bob之间不能超过k个字符
public class Demo12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        scanner.nextLine();//换行！！！
        String s = scanner.nextLine();
        StringBuffer sb = new StringBuffer();
        int a = -1000000,b = -1000000,count = 0;
        for (int i = 0; i < s.length(); i++){
            if(s.charAt(i)==' '||i==s.length()-1){
                if(i==s.length()-1)sb.append(s.charAt(i));
                String tmp = sb.toString();
//                System.out.println(tmp);
                boolean fa = false;
                boolean fb = false;
                boolean faa = false;
                boolean fbb = false;
                if(tmp.equals("Alice")){
                    a = i;
                    fa=true;
                }
                if(tmp.equals("Alice.")){
                    a = i;
                    faa=true;
                }
                if(tmp.equals("Bob")){
                    b = i;
                    fb = true;
                }
                if(tmp.equals("Bob.")){
                    b = i;
                    fbb = true;
                }
                if(fa&&((a-4-b)<=k)){
                   count++;
                }
                if(fb&&b-2-a<=k){
                   count++;
                }
                if(faa&&a-5-b<=k){
                   count++;
                }
                if(fbb&&b-3-a<=k){
                   count++;
                }
                sb = new StringBuffer();
                continue;
            }
            sb.append(s.charAt(i));
        }
        System.out.println(count);
    }
}
