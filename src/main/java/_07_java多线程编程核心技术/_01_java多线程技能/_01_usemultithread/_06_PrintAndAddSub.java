package _07_java多线程编程核心技术._01_java多线程技能._01_usemultithread;

public class _06_PrintAndAddSub extends Thread{
	private int a = 5;
	
	@Override
	public void run() {
		System.out.println("currentThreadName=" + Thread.currentThread().getName() + ",i=" + (a--));
	}
	
	public static void main(String[] args) {
		_06_PrintAndAddSub t = new _06_PrintAndAddSub();
		Thread t1 = new Thread(t, "A");
		Thread t2 = new Thread(t, "B");
		Thread t3 = new Thread(t, "C");
		Thread t4 = new Thread(t, "D");
		Thread t5 = new Thread(t, "E");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}
	
}
