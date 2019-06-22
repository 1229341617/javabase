package _05_�߼�����.java8������;

import java.util.Arrays;
import java.util.List;

public class Lambda {
	
	public void simpleListOutput(){
		List<String> ss = Arrays.asList(new String[]{"A", "B", "C"});
		
		//1.����forEach
		for (String s : ss) {
			System.out.println(s);
		}
		System.out.println("================");
		
		//2.lambda���ʽ
		ss.forEach((String s)->System.out.println(s));
		System.out.println("================");
		
		//3.java8�е�˫ð�Ų�����
		ss.forEach(System.out::println);
	}
	
	public void otherNameClass(){
		//1.1:����-�߳�ʵ��1
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out
						.println("thread1");
			}
		}).start();
		//1.2:lambda-�߳�ʵ��1
		new Thread(()->System.out.println("thread1-lambda")).start();
		
		//2.1:����-�߳�ʵ��2
		Runnable r1 = new Runnable() {
			@Override
			public void run() {
				System.out
						.println("runnable2");
			}
		};
		//2.2:lambda-�߳�ʵ��2
		Runnable r2 = ()->System.out.println("runnable2-lambda");
		new Thread(r1).start();
		new Thread(r2).start();
	}
}
