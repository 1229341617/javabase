package _07_java多线程编程核心技术._01_java多线程技能._03_isalive;

public class _03_IsAlive extends Thread{
	@Override
	public void run() {
		System.out.println("run:" + Thread.currentThread().isAlive());
	}
	
	public static void main(String[] args) throws InterruptedException {
		_03_IsAlive t = new _03_IsAlive();
		System.out.println("start:" + t.isAlive());
		t.start();
//		Thread.sleep(1000);
		System.out.println("end:" + t.isAlive());
	}
}
