package _05_�߼�����.java8������;

import org.junit.Test;

@SuppressWarnings("all")
public class LambdaTest {
	private static Lambda lambda;//����ģʽ-����ģʽ
	
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
