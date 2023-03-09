package main.test10;

import java.util.*;


public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 根据输入的表达式返回计算结果
     * @param expression string字符串 表达式
     * @return int整型
     */

    public static void main(String[] args) {
        System.out.println(calculate("(2+2)*3-4+6/2"));
    }
    private static final Map<Character,Integer> map = new HashMap<Character,Integer>(){
        {
            put('(',0);
            put('+',1);
            put('-',1);
            put('*',2);
            put('/',2);
            put(')',3);
        }
    };
    public static int calculate (String expression) {
        char[] x = expression.toCharArray();
        Stack<Character> op = new Stack<>();
        Stack<Integer> num = new Stack<>();
        StringBuilder t = new StringBuilder();
        System.out.println(Arrays.toString(x));
        for(char c:x){
            if(c==' '){
                continue;
            }else if(c>='0'&&c<='9'){
                t.append(c);
            }else{
                if(t.length()>0){
                    num.push(Integer.parseInt(t.toString()));
                    t.delete(0,t.length());
                }
                if(op.empty()){
                    op.push(c);
                }else{
                    if('('==c){
                        op.push(c);
                    }else if(')'==c){
                        while(op.peek()!='('){
                            operation(op,num);
                        }
                        op.pop();
                    }else{
                        do{
                            if (compare(c,op.peek())){
                                operation(op,num);
                                if (op.empty()){
                                    op.push(c);
                                    break;
                                }
                            }else {
                                op.push(c);
                                break;
                            }
                        }while (!op.empty());
                    }
                }
            }
        }
        if (t.length()>0){
            num.push(Integer.parseInt(t.toString()));
        }

        while (!op.empty()){
            operation(op,num);
        }
        return num.pop();
    }
    
    public static void operation(Stack<Character> op,Stack<Integer> num){
        char t = op.pop();
        int b = num.pop();
        int a = num.pop();
        int res = 0;
        switch(t){
            case '+':
                res = a+b;
                break;
            case '-':
                res = a-b;
                break;
            case '*':
                res = a*b;
                break;
            case '/':
                res = a/b;
                break;
           default:
                break;
        }
        num.push(res);
    }
    
    public static boolean compare(char op1,char op2){
        return map.get(op1)-map.get(op2)<=0;
    }
}