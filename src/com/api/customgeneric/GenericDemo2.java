/**
 * @author: zty
 * @program: JavaSE
 * @ClassName GenericDemo1
 * @description:
 * @create: 2022-02-10 20:24
 * @Version 1.0
 **/
package com.api.customgeneric;

import java.util.ArrayList;
/*
通配符：？
? 可以用在使用泛型的时候代表一切类型
E、T、K、V 是在定义泛型的时候使用代表一切类型

泛型的上下限：
? extends Car：那么 ? 必须是 Car 或者其子类（泛型的上限）
? super Car：那么 ? 必须是 Car 或者其父类（泛型的下限，不是很常见）
 */
//需求：开发一个极品飞车的游戏，所有的汽车都能一起参与比赛。
public class GenericDemo2 {
    public static void main(String[] args) {
        ArrayList<BMW> bmws = new ArrayList<>();
        ArrayList<AD> ads = new ArrayList<>();
        ArrayList<Dog> dogs = new ArrayList<>();
        run(bmws);
        //run(dogs);
    }
    //public static void run(ArrayList<?> car){}//这样dogs对象也能进入比赛
    public static void run(ArrayList<? extends Car> car){}//这样只有继承了Car的对象才能进入方法。
}

class Car{}
class BMW extends Car{}
class AD extends Car{}
class Dog{}