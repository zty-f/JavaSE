package main.zty.常用数据结构总结;

import java.util.PriorityQueue;

/**
 * @version V1.0
 * @Copyright swpu
 * @author: zty-f
 * @date: 2022/3/13 17:08
 * @Description: 优先队列
 */
public class PriorityQueueStudy {
    public static void main(String[] args) {
        //##原始写法
        //PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
        //    @Override
        //    public int compare(Integer o1, Integer o2) {
        //        return o1.compareTo(o2);
        //    }
        //});

        //lambda表达式简写声明
        PriorityQueue<Integer> queue = new PriorityQueue<>((a,b)->b-a);//降序   默认升序
        /*
        peek()//返回队首元素
        poll()//返回队首元素，队首元素出队列
        add() offer()//添加元素
        size()//返回队列元素个数
        isEmpty()//判断队列是否为空，为空返回true,不空返回false
         */
        //1.添加元素
        queue.add(1);
        queue.offer(5);
        queue.add(7);
        queue.offer(3);
        queue.add(2);
        //！！！删除指定元素
        queue.remove(5);
        /*
        PriorityQueue的iterator（）不保证以任何特定顺序遍历队列元素。
        若想按特定顺序遍历，先将队列转成数组，然后排序遍历。Arrays.sort(queue.toArray())
         */
        for (Integer integer : queue) {
            System.out.print(integer);
        }
        System.out.println();//12753  lambda声明结果：73512
        for (int i = 0; i < 5; i++) {
            System.out.print(queue.poll());
        }
        System.out.println();//12357  lambda声明结果：75321
    }
}
        //高级用法，根据对象内部的年龄和升高进行排序！
//class Main {
//    public static void main(String[] args) {
//        PriorityQueue<person> priorityQueue = new PriorityQueue<person>(10, new Comparator<person>() {
//            @Override
//            public int compare(person o1, person o2) {
//                if (o1.getAge() != o2.getAge()){
//                    return o1.getAge() - o2.getAge();
//                }
//                else if(o1.getAge() == o2.getAge() && o1.getTall()!=o2.getTall()){
//                    return o1.getTall() - o2.getTall();
//                }
//                else {
//                    return o2.getName().length() - o1.getName().length();
//                }
//
//            }
//        });
//
//        priorityQueue.add(new person(11,160,"Nick"));
//        priorityQueue.add(new person(16,172,"John"));
//        priorityQueue.add(new person(18,180,"Mike"));
//        priorityQueue.add(new person(22,183,"Jordan"));
//        priorityQueue.add(new person(16,172,"Alice"));
//        person p;
//        while (!priorityQueue.isEmpty()){
//            p = priorityQueue.poll();
//            System.out.println(p.toString());
//        }
//    }
//
//}
//
//class person{
//    private int age;
//    private int tall;
//    private String name;
//
//    public person(int age, int tall, String name) {
//        this.age = age;
//        this.tall = tall;
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public int getTall() {
//        return tall;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    @Override
//    public String toString() {
//        return "person{" +
//                "age=" + age +
//                ", tall=" + tall +
//                ", name='" + name + '\'' +
//                '}';
//    }
//}
