package main.zty.基础学习;

public class Print{
	static boolean out(char c){
		System.out.print(c);
		return true;
	}
	public static void main(String[] argv){
		int i = 0;
		for(out('A');out('B') && (i<2);out('C')){//可以这样定义循环
			i++;
			out('D');
		}
		//for循环三个参数必须是可以单独成行的语句。
		for(System.out.println(1<2);;i++){
			break;
		}
		float f = 42.0f;
		long l = 42;
		System.out.println(f==l);
		System.out.println(1/0);
	}
}