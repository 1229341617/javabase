package _07_java多线程编程核心技术._01_java多线程技能._04_sleep;

public class _04_Sleep_sync extends Thread{
	@Override
	public void run() {
		try {
			System.out.println("run-start...");
			Thread.sleep(2000);
			System.out.println("run-end...");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		System.out.println("main-start:" + System.currentTimeMillis());
		new _04_Sleep_sync().run();
		System.out.println("main-end:" + System.currentTimeMillis());
	}
	
	
}
