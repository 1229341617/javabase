package _05_高级进阶.java8新特性;

import org.junit.Test;

@SuppressWarnings("all")
public class LambdaTest {
	private static Lambda lambda;//单例模式-懒汉模式
	
	public static Lambda getInstance(){
		if(lambda == null){
			lambda = new Lambda();
		}
		return lambda;
	}

	@Test
	public void testSimpleListOutput() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		this.getInstance().simpleListOutput();
	}

	@Test
	public void otherNameClass(){
		this.getInstance().otherNameClass();
	}
	
}
