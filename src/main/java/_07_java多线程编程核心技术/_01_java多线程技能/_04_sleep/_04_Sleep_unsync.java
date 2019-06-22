package _07_java多线程编程核心技术._01_java多线程技能._04_sleep;

public class _04_Sleep_unsync extends Thread{
	
	@Override
	public void run() {
		try {
			System.out.println("run-start:" + System.currentTimeMillis());
			Thread.sleep(2000);
			System.out.println("run-end:" + System.currentTimeMillis());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		System.out.println("main-start...");
		new _04_Sleep_unsync().start();
		System.out.println("main-end...");
	}
	
	
}
