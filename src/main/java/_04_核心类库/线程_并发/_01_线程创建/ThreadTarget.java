package _04_�������.�߳�_����._01_�̴߳���;

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
