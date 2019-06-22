package _07_java多线程编程核心技术._01_java多线程技能._01_usemultithread;

public class _04_ShareVariable_Safe extends Thread{
	public int count = 5;
	
	@Override
	synchronized public void run() {
		count--;
		System.out.println(Thread.currentThread().getName() + " = " + count);
	}
	
	public static void main(String[] args) {
		_04_ShareVariable_Safe runnable = new _04_ShareVariable_Safe();
		Thread t1 = new Thread(runnable, "A");
		Thread t2 = new Thread(runnable, "B");
		Thread t3 = new Thread(runnable, "C");
		Thread t4 = new Thread(runnable, "D");
		Thread t5 = new Thread(runnable, "E");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}
	
}
