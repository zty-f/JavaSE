package main.zty.基础学习;

class Car extends Vehicle
{
    public static void main (String[] args)
    {
        new Car().run();//自己类里面可以调用private方法，类外则不行。
        //输出：Car
    }
    private final void run()
    {
        System. out. println ("Car");
    }
}
class Vehicle
{
    private final void run()
    {
        System. out. println("Vehicle");
    }
}