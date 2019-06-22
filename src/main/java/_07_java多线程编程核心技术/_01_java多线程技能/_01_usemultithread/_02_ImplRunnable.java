package _07_java多线程编程核心技术._01_java多线程技能._01_usemultithread;

public class _02_ImplRunnable implements Runnable{

	@Override
	public void run() {
		randomTest();
	}

	
	
	public static void main(String[] args) {
		test1();
	}

	public static void test1() {
		Thread t = new Thread(new _02_ImplRunnable(), "thread");
		t.start();
		
		randomTest();
	}
	
	private static void randomTest() {
		try {
			for (int i = 0; i < 10; i++) {
				int times = (int)(Math.random() * 1000);
				Thread.sleep(times);
				System.out.println(Thread.currentThread().getName());
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
