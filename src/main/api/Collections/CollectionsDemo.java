package main.api.Collections;

import java.util.*;

public class CollectionsDemo {
    public static void main(String[] args) {
        Collection<String> names = new ArrayList<>();
        Collections.addAll(names,"张","王","李","赵");
        
        List<Double> scores = new ArrayList<>();
        Collections.addAll(scores, 98.5, 66.5 , 59.5 , 66.5 , 99.5 );
        Collections.shuffle(scores);
        Collections.sort(scores); // 默认升序排序！
        System.out.println(scores);
        
        List<Student> students = new ArrayList<>();
        Student s1 = new Student("a", 12);
        Student s2 = new Student("b", 13);
        Student s3 = new Student("c", 14);
        Collections.addAll(students,s1,s2,s3);
        //降序  lambda表达式
        Collections.sort(students,(a,b)->b.getAge()- a.getAge());

        System.out.println(students);

        //map经典代码
        Map<String, Integer> maps = new HashMap<>();
        maps.put("手机",1);
        maps.put("啊啊",1);
        System.out.println(maps);
    }
}

