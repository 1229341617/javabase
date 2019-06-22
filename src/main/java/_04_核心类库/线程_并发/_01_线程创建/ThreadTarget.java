package _04_核心类库.线程_并发._01_线程创建;

public class ThreadTarget {
	public static void main(String[] args) {
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				System.out
						.println("ThreadTarget.main(...).new Runnable() {...}.run()");
			}
		};
		Thread t1 = new Thread(runnable);
		t1.start();
	}
}
