package com.api.Stream;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/*
			方法名								说明
void forEach(Consumer<? super T> action)		逐一处理（遍历）
long count										返回流中的元素数
Stream filter(Predicate<? super T> predicate)	用于对流中的数据进行过滤
Stream limit(long maxSize)						返回此流中的元素组成的流，截取前指定参数个数的数据
Stream skip(long n)								跳过指定参数个数的数据，返回由该流的剩余元素组成的流
Stream map(Function<? super T,? extends R> mapper)	加工方法，将当前流中的 T 类型数据转换为另一种 R 类型的流
static Stream concat(Stream a, Stream b)	合并 a 和 b 两个流为一个，调用 Stream.concat(s1,s2)
Stream distinct()							返回由该流的不同元素组成的流
 */


public class StreamDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张无忌"); list.add("周芷若"); list.add("赵敏");
        list.add("张强"); list.add("张三丰"); list.add("张三丰");
        //取以张开头并且名字是三位数的
        list.stream().filter(s -> s.startsWith("张"))
				.filter(s -> s.length()==3).forEach(System.out::println);
        //统计数量
		long count = list.stream().filter(s -> s.startsWith("张"))
				.filter(s -> s.length()==3).count();
		//取前两个
		list.stream().filter(s -> s.length()==3).limit(2).forEach(System.out::println);
		//跳过前两个
		list.stream().filter(s -> s.length()==3).skip(2).forEach(System.out::println);

		// 需求：把名称都加上“张三的:+xxx”
		list.stream().map(s -> "张三的:"+s).forEach(System.out::println);
		// 需求：把名称都加工厂学生对象放上去!!
		// list.stream().map(name -> new Student(name));
		list.stream().map(Student::new).forEach(System.out::println);
                                          	
		//数组流
		Stream<Integer> s1 = Stream.of(10,20,30,40,50);
		//集合流
		Stream<String> s2 = list.stream();
		//合并流
		Stream<Object> s3 = Stream.concat(s1,s2);
		s3.forEach(System.out::println);
    }
}
