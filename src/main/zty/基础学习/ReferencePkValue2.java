package main.zty.基础学习;


/*
（1）基本数据类型传值，对形参的修改不会影响实参；
（2）引用类型传引用，形参和实参指向同一个内存地址（同一个对象），所以对参数的修改会影响到实际的对象；
（3）String, Integer, Double等immutable的类型特殊处理，可以理解为传值，最后的操作不会修改实参对象。
 */
public class ReferencePkValue2 {
     
    public static void main(String[] args){
        ReferencePkValue2 t = new ReferencePkValue2(); 
        int a=99; 
        t.test1(a);//这里传递的参数a就是按值传递 
        System.out.println(a);

        Integer x = 1;
        t.test3(x);
        System.out.println(x);
         
        MyObj obj=new MyObj(); 
        t.test2(obj);//这里传递的参数obj就是引用传递
        System.out.println(obj.b);
    } 
     
    public void test1(int a){ 
        a++;
        System.out.println(a);
        }
     
    public void test2(MyObj obj){ 
        obj.b=100;
        System.out.println(obj.b);
        }
    public void test3(Integer x){
        x++;
        System.out.println(x);
    }

}