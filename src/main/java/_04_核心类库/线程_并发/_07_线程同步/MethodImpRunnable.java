package _04_核心类库.线程_并发._07_线程同步;

public class MethodImpRunnable implements Runnable{
	private static int count;
	
	@Override
	public void run() {
		for (int i = 0; i < 10000000; i++) {
			increase();
		}
	}

	private synchronized void increase() {
		count++;
	}
	
	public static void main(String[] args) throws InterruptedException {
		MethodImpRunnable instance = new MethodImpRunnable();
		Thread t1 = new Thread(instance);
		Thread t2 = new Thread(instance);
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println(count);
	}
}
