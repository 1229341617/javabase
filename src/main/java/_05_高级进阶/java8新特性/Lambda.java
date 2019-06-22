package _05_高级进阶.java8新特性;

import java.util.Arrays;
import java.util.List;

public class Lambda {
	
	public void simpleListOutput(){
		List<String> ss = Arrays.asList(new String[]{"A", "B", "C"});
		
		//1.常规forEach
		for (String s : ss) {
			System.out.println(s);
		}
		System.out.println("================");
		
		//2.lambda表达式
		ss.forEach((String s)->System.out.println(s));
		System.out.println("================");
		
		//3.java8中的双冒号操作符
		ss.forEach(System.out::println);
	}
	
	public void otherNameClass(){
		//1.1:常规-线程实现1
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out
						.println("thread1");
			}
		}).start();
		//1.2:lambda-线程实现1
		new Thread(()->System.out.println("thread1-lambda")).start();
		
		//2.1:常规-线程实现2
		Runnable r1 = new Runnable() {
			@Override
			public void run() {
				System.out
						.println("runnable2");
			}
		};
		//2.2:lambda-线程实现2
		Runnable r2 = ()->System.out.println("runnable2-lambda");
		new Thread(r1).start();
		new Thread(r2).start();
	}
}
