package _07_java多线程编程核心技术._01_java多线程技能._02_currentthread;

public class _02_CurrentThread extends Thread{
	
	public _02_CurrentThread(String name){
		this.setName(name);
		System.out.println("构造方法打印：" + Thread.currentThread().getName());
	}
	
	@Override
	public void run() {
		System.out.println("run方法打印：" + Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		test1();
//		test2();
	}

	private static void test2() {
		_02_CurrentThread t = new _02_CurrentThread("A");
		t.run();
	}

	public static void test1() {
		_02_CurrentThread t = new _02_CurrentThread("A");
		t.start();
	}
}
